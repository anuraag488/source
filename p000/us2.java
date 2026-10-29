package p000;

import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class us2 {

    /* JADX INFO: renamed from: b */
    public static final Charset f32146b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final if1 f32147a;

    public us2(if1 if1Var) {
        this.f32147a = if1Var;
    }

    /* JADX INFO: renamed from: a */
    public static HashMap m11639a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = null;
            if (!jSONObject.isNull(next)) {
                strOptString = jSONObject.optString(next, null);
            }
            map.put(next, strOptString);
        }
        return map;
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList m11640b(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            try {
                w42 w42Var = nq3.f26037a;
                JSONObject jSONObject = new JSONObject(string);
                arrayList.add(nq3.m8816a(jSONObject.getString("rolloutId"), jSONObject.getString("parameterKey"), jSONObject.getString("parameterValue"), jSONObject.getString("variantId"), jSONObject.getLong("templateVersion")));
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Failed de-serializing rollouts state. " + string, e);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static String m11641e(List list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new JSONObject(nq3.f26037a.m12084h(list.get(i))));
            } catch (JSONException e) {
                Log.w("FirebaseCrashlytics", "Exception parsing rollout assignment!", e);
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    /* JADX INFO: renamed from: f */
    public static void m11642f(File file) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath(), null);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m11643g(File file, String str) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", c75.m3879k("Deleted corrupt file: ", file.getAbsolutePath(), "\nReason: ", str), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r8v4, types: [int] */
    /* JADX INFO: renamed from: c */
    public final Map m11644c(String str, boolean z) throws Throwable {
        ?? r8;
        FileInputStream fileInputStream;
        Exception e;
        if1 if1Var = this.f32147a;
        File fileM6788c = z ? if1Var.m6788c(str, "internal-keys") : if1Var.m6788c(str, "keys");
        if (!fileM6788c.exists() || fileM6788c.length() == 0) {
            m11643g(fileM6788c, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_MAP;
        }
        ?? r7 = 0;
        try {
            try {
                fileInputStream = new FileInputStream(fileM6788c);
                try {
                    HashMap mapM11639a = m11639a(se0.m10714b0(fileInputStream));
                    se0.m10731l(fileInputStream, "Failed to close user metadata file.");
                    return mapM11639a;
                } catch (Exception e2) {
                    e = e2;
                    Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                    m11642f(fileM6788c);
                    se0.m10731l(fileInputStream, "Failed to close user metadata file.");
                    return Collections.EMPTY_MAP;
                }
            } catch (Exception e3) {
                fileInputStream = null;
                e = e3;
            } catch (Throwable th) {
                th = th;
                se0.m10731l(r7, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r7 = r8;
            se0.m10731l(r7, "Failed to close user metadata file.");
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Closeable] */
    /* JADX INFO: renamed from: d */
    public final String m11645d(String str) throws Throwable {
        FileInputStream fileInputStream;
        File fileM6788c = this.f32147a.m6788c(str, "user-data");
        ?? r5 = 0;
        if (fileM6788c.exists()) {
            ?? r2 = (fileM6788c.length() > 0L ? 1 : (fileM6788c.length() == 0L ? 0 : -1));
            try {
                if (r2 != 0) {
                    try {
                        fileInputStream = new FileInputStream(fileM6788c);
                        try {
                            JSONObject jSONObject = new JSONObject(se0.m10714b0(fileInputStream));
                            String strOptString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                            String str2 = "Loaded userId " + strOptString + " for session " + str;
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str2, null);
                            }
                            se0.m10731l(fileInputStream, "Failed to close user metadata file.");
                            return strOptString;
                        } catch (Exception e) {
                            e = e;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                            m11642f(fileM6788c);
                            se0.m10731l(fileInputStream, "Failed to close user metadata file.");
                            return null;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        se0.m10731l(r5, "Failed to close user metadata file.");
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r5 = r2;
            }
        }
        String strM13620t = zi4.m13620t("No userId set for session ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strM13620t, null);
        }
        m11642f(fileM6788c);
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m11646h(String str, Map map, boolean z) {
        BufferedWriter bufferedWriter;
        Exception e;
        if1 if1Var = this.f32147a;
        File fileM6788c = z ? if1Var.m6788c(str, "internal-keys") : if1Var.m6788c(str, "keys");
        BufferedWriter bufferedWriter2 = null;
        try {
            String string = new JSONObject(map).toString();
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileM6788c), f32146b));
            try {
                try {
                    bufferedWriter.write(string);
                    bufferedWriter.flush();
                    se0.m10731l(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter2 = bufferedWriter;
                    se0.m10731l(bufferedWriter2, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
                m11642f(fileM6788c);
                se0.m10731l(bufferedWriter, "Failed to close key/value metadata file.");
            }
        } catch (Exception e3) {
            bufferedWriter = null;
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            se0.m10731l(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX INFO: renamed from: i */
    public final void m11647i(String str, List list) {
        BufferedWriter bufferedWriter;
        Exception e;
        File fileM6788c = this.f32147a.m6788c(str, "rollouts-state");
        ?? IsEmpty = list.isEmpty();
        if (IsEmpty != 0) {
            m11643g(fileM6788c, "Rollout state is empty for session: " + str);
            return;
        }
        ?? r6 = 0;
        try {
            try {
                String strM11641e = m11641e(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileM6788c), f32146b));
                try {
                    bufferedWriter.write(strM11641e);
                    bufferedWriter.flush();
                    se0.m10731l(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Exception e2) {
                    e = e2;
                    Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e);
                    m11642f(fileM6788c);
                    se0.m10731l(bufferedWriter, "Failed to close rollouts state file.");
                }
            } catch (Exception e3) {
                bufferedWriter = null;
                e = e3;
            } catch (Throwable th) {
                th = th;
                se0.m10731l(r6, "Failed to close rollouts state file.");
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r6 = IsEmpty;
            se0.m10731l(r6, "Failed to close rollouts state file.");
            throw th;
        }
    }
}
