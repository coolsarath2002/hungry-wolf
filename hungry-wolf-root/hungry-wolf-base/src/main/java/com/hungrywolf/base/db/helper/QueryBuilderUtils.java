package com.hungrywolf.base.db.helper;

public class QueryBuilderUtils {

	/*public static Query generateCriteria(Map<String, String> criteria) {
		Query _query = new Query();

		//QueryBuilder _baseQuery =QueryBuilder.start();
		Criteria c = null;
		for (Map.Entry<String, String> entry : criteria.entrySet()) {
			if (c == null) {
				c = Criteria.where(entry.getKey()).in(entry.getValue());
			} else {
				c.and(entry.getKey()).is(entry.getValue());
			}
			
			 * _baseQuery.and(new QueryBuilder().start().put(entry.getKey())
			 * .in(entry.getValue()).get()).get();
			 
		}
		_query.addCriteria(c);
		return _query;
	}

	public static Update updateRecord(Map<String, String> criteria) {
		Update _update = new Update();
		for (Map.Entry<String, String> entry : criteria.entrySet()) {
			_update.set(entry.getKey(), entry.getValue());
		}
		return _update;
	}

	public static JSONObject build(QueryBuilder queryBuilder) throws JSONException {
		DBObject dbo = queryBuilder.get();
		return new JSONObject(JSON.serialize(dbo));
	}*/

}
