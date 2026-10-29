package p000;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wj0 {

    /* JADX INFO: renamed from: h */
    public static final Date f33415h = new Date(0);

    /* JADX INFO: renamed from: a */
    public final JSONObject f33416a;

    /* JADX INFO: renamed from: b */
    public final JSONObject f33417b;

    /* JADX INFO: renamed from: c */
    public final Date f33418c;

    /* JADX INFO: renamed from: d */
    public final JSONArray f33419d;

    /* JADX INFO: renamed from: e */
    public final JSONObject f33420e;

    /* JADX INFO: renamed from: f */
    public final long f33421f;

    /* JADX INFO: renamed from: g */
    public final JSONArray f33422g;

    public wj0(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j, JSONArray jSONArray2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f33417b = jSONObject;
        this.f33418c = date;
        this.f33419d = jSONArray;
        this.f33420e = jSONObject2;
        this.f33421f = j;
        this.f33422g = jSONArray2;
        this.f33416a = jSONObject3;
    }

    /* JADX INFO: renamed from: a */
    public static wj0 m12308a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        return new wj0(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), jSONArrayOptJSONArray);
    }

    /* JADX INFO: renamed from: d */
    public static vj0 m12309d() {
        vj0 vj0Var = new vj0();
        vj0Var.f32659a = new JSONObject();
        vj0Var.f32660b = f33415h;
        vj0Var.f32661c = new JSONArray();
        vj0Var.f32662d = new JSONObject();
        vj0Var.f32663e = 0L;
        vj0Var.f32664f = new JSONArray();
        return vj0Var;
    }

    /* JADX INFO: renamed from: b */
    public final HashMap m12310b() throws JSONException {
        HashMap map = new HashMap();
        int i = 0;
        while (true) {
            JSONArray jSONArray = this.f33419d;
            if (i >= jSONArray.length()) {
                return map;
            }
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject.has("affectedParameterKeys") && !jSONObject.getString("experimentId").startsWith("rollout")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    map.put(jSONArray2.getString(i2), jSONObject);
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final HashMap m12311c() throws JSONException {
        HashMap map = new HashMap();
        int i = 0;
        while (true) {
            JSONArray jSONArray = this.f33422g;
            if (i >= jSONArray.length()) {
                return map;
            }
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                String string3 = jSONArray2.getString(i2);
                if (!map.containsKey(string3)) {
                    map.put(string3, new HashMap());
                }
                Map map2 = (Map) map.get(string3);
                if (map2 != null) {
                    map2.put(string, string2);
                }
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wj0) {
            return this.f33416a.toString().equals(((wj0) obj).f33416a.toString());
        }
        return false;
    }

    public final int hashCode() {
        return this.f33416a.hashCode();
    }

    public final String toString() {
        return this.f33416a.toString();
    }
}
