package com.eurodyn.qlack2.fuse.search.api.dto;

/**
 * Represents a specific hit within a set of hits held by
 * {@link SearchResultDTO}.
 */
public class SearchHitDTO {
	// The source representation of this hit as a JSON object. This property
	// holds the properties and values of the original document that was
	// indexed, therefore it is a good candidate to be deserialised to get a
	// a concrete objects out of a search result hit.
	private String source;

	// The score of this hit.
	private float score;

	// The type of the document that was found. Combine this property with
	// <i>source</i>, so that you know to which object you should deserialise
	// a search hit.
	private String type;

  private String id;

	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}

	/**
	 * @param source
	 *            the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * @return the score
	 */
	public float getScore() {
		return score;
	}

	/**
	 * @param score
	 *            the score to set
	 */
	public void setScore(float score) {
		this.score = score;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

  /**
   * @return the id
   */

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

	@Override
	public String toString() {
		return "SearchHitDTO [source=" + source + ", score=" + score + ", type=" + type + "]";
	}

}
