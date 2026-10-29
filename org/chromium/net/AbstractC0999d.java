package org.chromium.net;

import org.json.JSONException;
import org.json.JSONObject;
import p000.zi4;

/* JADX INFO: renamed from: org.chromium.net.d */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0999d {
    /* JADX INFO: renamed from: a */
    public static JSONObject m9247a(String str, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        } catch (JSONException e) {
            throw new IllegalArgumentException(zi4.m13617q(']', "Failed adding a default object for key [", str), e);
        }
    }
}
