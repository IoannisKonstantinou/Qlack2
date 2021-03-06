package com.eurodyn.qlack2.fuse.security.proxy.impl.util;

import com.eurodyn.qlack2.common.util.util.TokenHolder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.cxf.jaxrs.interceptor.JAXRSInInterceptor;
import org.apache.cxf.message.Message;

import java.text.MessageFormat;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Extracts the QLACK Fuse IDM Ticket from the header of a request and places it
 * into a ThreadLocal variable.
 */
public class ExtractTicketInterceptor extends JAXRSInInterceptor {

  private static final Logger LOGGER = Logger.getLogger(ExtractTicketInterceptor.class.getName());
  private static final ObjectMapper MAPPER = new ObjectMapper();

  /** The name of the header to look for the security ticket. */
  private String ticketHeaderName;

  /** A helper setting to dump all incoming headers to log. Never leave this on in production. */
  private boolean dumpHeaders;

  public void setTicketHeaderName(String ticketHeaderName) {
    this.ticketHeaderName = ticketHeaderName;
  }

  public void setDumpHeaders(boolean dumpHeaders) {
    this.dumpHeaders = dumpHeaders;
  }

  @Override
  public void handleMessage(Message message) {
    /** A quick sanity check for developers. */
    if (StringUtils.isBlank(ticketHeaderName) || ticketHeaderName.indexOf("{") > -1) {
      LOGGER.log(Level.WARNING, MessageFormat.format(
        "It seems you have not set the name of the"
          + " ticket to extract. Currently set name: {0}.", ticketHeaderName));
    }

    /** Check if the request contains a security token and inject it. */
    @SuppressWarnings("unchecked")
    final Map<String, List<String>> headers = (Map<String, List<String>>) message.get(Message.PROTOCOL_HEADERS);

//    try {
//      System.out.println(MAPPER.writerWithDefaultPrettyPrinter().writeValueAsString(headers));
//    } catch (JsonProcessingException e) {
//      e.printStackTrace();
//    }

    List<String> list =
      ((Map<String, List<String>>) message.get(Message.PROTOCOL_HEADERS)).get(ticketHeaderName);
    if (CollectionUtils.isNotEmpty(list)) {
      TokenHolder.setToken(list.get(0));
    } else {
      LOGGER.log(Level.FINE,
        "Could not find a ticket on this request.");
    }
  }
}
