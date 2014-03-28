package com.it;

import org.dbunit.DatabaseUnitException;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.operation.AbstractOperation;

import java.sql.SQLException;

public class ClassExtendingLibrary extends AbstractOperation {

	@Override
	public void execute(IDatabaseConnection connection, IDataSet dataSet) throws DatabaseUnitException, SQLException {
		// nothing
	}
}
