/**
 * Copyright (C) 2015 Stubhub.
 */
package io.bigdime.handler.file;

public final class PartitionNamesParserHandlerConstants {
	private static final PartitionNamesParserHandlerConstants instance = new PartitionNamesParserHandlerConstants();

	private PartitionNamesParserHandlerConstants() {
	}

	public static PartitionNamesParserHandlerConstants getInstance() {
		return instance;
	}

	public static final String REGEX = "regex";
	public static final String HEADER_NAME = "header-name";
	 public static final String PARTITION_NAMES = "partition-names";
	public static final String TRUNCATE_CHARACTERS = "truncate-characters";
}