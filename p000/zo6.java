package p000;

import android.util.Log;
import java.lang.invoke.VarHandle;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class zo6 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f36224a = Pattern.compile("^" + Pattern.quote("CronetExperimentalOption_") + "(.+?)_KEY_(.+)$");

    /* JADX INFO: renamed from: a */
    public static String m13649a(String str, Map map) {
        Object objValueOf;
        xl6 xl6Var;
        JSONObject jSONObject = null;
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            tn5 tn5Var = (tn5) entry.getValue();
            if (str2.startsWith("CronetExperimentalOption_")) {
                Matcher matcher = f36224a.matcher(str2);
                if (!matcher.matches()) {
                    C1077qn.m9987m(zi4.m13617q('`', "Failed to parse experimental options flag override `", str2));
                    return null;
                }
                String strGroup = matcher.group(1);
                String strGroup2 = matcher.group(2);
                int iM11070a = tn5Var.m11070a();
                Object obj = tn5Var.f31275a;
                if (iM11070a == 0) {
                    objValueOf = Boolean.valueOf(tn5Var.m11072c());
                } else if (iM11070a == 1) {
                    tn5Var.m11073d(1);
                    Long l = (Long) obj;
                    l.longValue();
                    objValueOf = l;
                } else if (iM11070a == 2) {
                    tn5Var.m11073d(2);
                    objValueOf = Double.valueOf(((Float) obj).floatValue());
                } else {
                    if (iM11070a != 3) {
                        C1077qn.m9987m(zi4.m13621u("Failed to parse experimental options flag override `", str2, "`: Bytes values are not supported"));
                        return null;
                    }
                    objValueOf = tn5Var.m11071b();
                }
                xl6Var = new xl6();
                Objects.requireNonNull(strGroup, "sectionName cannot be null");
                xl6Var.f34400a = strGroup;
                Objects.requireNonNull(strGroup2, "optionName cannot be null");
                xl6Var.f34401b = strGroup2;
                Objects.requireNonNull(objValueOf, "value cannot be null");
                xl6Var.f34402c = objValueOf;
                VarHandle.storeStoreFence();
            } else {
                xl6Var = null;
            }
            if (xl6Var != null) {
                String str3 = (String) xl6Var.f34401b;
                String str4 = xl6Var.f34400a;
                if (jSONObject == null) {
                    if (str == null || str.isEmpty()) {
                        jSONObject = new JSONObject();
                    } else {
                        try {
                            jSONObject = new JSONObject(str);
                        } catch (JSONException e) {
                            Log.w("cn_ExpOptionsFlags", "Failed to parse base experimental options JSON", e);
                            jSONObject = null;
                        }
                    }
                    if (jSONObject == null) {
                        return str;
                    }
                }
                try {
                    if (!jSONObject.has(str4)) {
                        jSONObject.put(str4, new JSONObject());
                    }
                    jSONObject.getJSONObject(str4).put(str3, xl6Var.f34402c);
                } catch (JSONException e2) {
                    throw new IllegalArgumentException("Failed to apply experimental options flag override for section `" + str4 + "`, option `" + str3 + '`', e2);
                }
            }
        }
        return jSONObject != null ? jSONObject.toString() : str;
    }
}
