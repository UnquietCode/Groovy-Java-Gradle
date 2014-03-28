package com.test;

import org.dbunit.DataSourceBasedDBTestCase;
import org.dbunit.dataset.IDataSet;

import javax.sql.DataSource;

public class TestBase extends DataSourceBasedDBTestCase {
	public static final ClassExtendingLibrary library = new ClassExtendingLibrary();

	@Override
	protected DataSource getDataSource() {
		return null;
	}

	@Override
	protected IDataSet getDataSet() throws Exception {
		return null;
	}
}
