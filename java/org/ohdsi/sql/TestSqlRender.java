package org.ohdsi.sql;

public class TestSqlRender {

	public static void main(String[] args) {
//		String sql = "SELECT * FROM table {@a = true} ?  {WHERE name = '@name'};";
//		sql = SqlRender.renderSql(sql, new String[]{"name", "a"}, new String[]{"NA\\joe", "true"});
//		System.out.println(sql);	
//		String path = "inst/csv/replacementPatterns.csv";
//		String sourceSql = "--HINT DISTRIBUTE_ON_KEY(row_id)\nSELECT * INTO #my_table FROM other_table;";
//		String sql;
//		sql = SqlTranslate.translateSqlWithPath(sourceSql, "pdw", null, null, path);
//		System.out.println(sql);		
//		
//		sql = SqlTranslate.translateSqlWithPath(sourceSql, "oracle", null, null, path);
//		System.out.println(sql);
		
//		String sql = "SELECT * FROM @my_table";
//		for (String warning : SqlRender.checkSql(sql, new String[]{"my_table"}, new String[]{"asdfs"}))
//			System.out.println(warning);

		String sql = "SELECT * FROM #abcdefghijklmnopqrstuvwxyz";
		for (String warning : SqlTranslate.check(sql, ""))
			System.out.println(warning);
	}
}
