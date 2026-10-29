package p000;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.lang.invoke.VarHandle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class r36 implements dr6 {

    /* JADX INFO: renamed from: a */
    public Object f28985a;

    /* JADX INFO: renamed from: b */
    public Object f28986b;

    /* JADX INFO: renamed from: c */
    public Object f28987c;

    /* JADX INFO: renamed from: d */
    public Object f28988d;

    public r36(r36 r36Var, yg3 yg3Var) {
        this.f28987c = new HashMap();
        this.f28988d = new HashMap();
        this.f28985a = r36Var;
        this.f28986b = yg3Var;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00fe A[Catch: NumberFormatException | JSONException -> 0x010b, NumberFormatException | JSONException -> 0x010b, TRY_LEAVE, TryCatch #0 {NumberFormatException | JSONException -> 0x010b, blocks: (B:10:0x0031, B:24:0x0065, B:24:0x0065, B:26:0x0072, B:26:0x0072, B:28:0x0084, B:28:0x0084, B:29:0x008d, B:29:0x008d, B:51:0x00fe, B:51:0x00fe, B:33:0x009a, B:33:0x009a, B:35:0x00a7, B:35:0x00a7, B:37:0x00b9, B:37:0x00b9, B:38:0x00c2, B:38:0x00c2, B:42:0x00ce, B:42:0x00ce, B:46:0x00de, B:46:0x00de, B:50:0x00f2, B:50:0x00f2), top: B:63:0x0031, outer: #1 }] */
    /* JADX INFO: renamed from: a */
    public Bundle m10190a() {
        s86 s86Var = (s86) this.f28988d;
        oa6 oa6Var = (oa6) s86Var.f36084a;
        if (((Bundle) this.f28987c) == null) {
            String string = s86Var.m10560y().getString((String) this.f28986b, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode != 115) {
                                        if (iHashCode != 3352) {
                                            if (iHashCode == 3445 && string3.equals("la")) {
                                                ho6.m6466a();
                                                if (oa6Var.f26512d.m9225E(null, e56.f17750Q0)) {
                                                    JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                                    int length = jSONArray2.length();
                                                    long[] jArr = new long[length];
                                                    for (int i2 = 0; i2 < length; i2++) {
                                                        jArr[i2] = jSONArray2.optLong(i2);
                                                    }
                                                    bundle.putLongArray(string2, jArr);
                                                }
                                            } else {
                                                d76 d76Var = oa6Var.f26514f;
                                                oa6.m9016l(d76Var);
                                                d76Var.f16835j.m12505b(string3, "Unrecognized persisted bundle type. Type");
                                            }
                                        } else if (string3.equals("ia")) {
                                            ho6.m6466a();
                                            if (oa6Var.f26512d.m9225E(null, e56.f17750Q0)) {
                                                JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                                int length2 = jSONArray3.length();
                                                int[] iArr = new int[length2];
                                                for (int i3 = 0; i3 < length2; i3++) {
                                                    iArr[i3] = jSONArray3.optInt(i3);
                                                }
                                                bundle.putIntArray(string2, iArr);
                                            }
                                        } else {
                                            d76 d76Var2 = oa6Var.f26514f;
                                            oa6.m9016l(d76Var2);
                                            d76Var2.f16835j.m12505b(string3, "Unrecognized persisted bundle type. Type");
                                        }
                                    } else if (string3.equals("s")) {
                                        bundle.putString(string2, jSONObject.getString("v"));
                                    } else {
                                        d76 d76Var3 = oa6Var.f26514f;
                                        oa6.m9016l(d76Var3);
                                        d76Var3.f16835j.m12505b(string3, "Unrecognized persisted bundle type. Type");
                                    }
                                } else if (string3.equals("l")) {
                                    bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                                } else {
                                    d76 d76Var4 = oa6Var.f26514f;
                                    oa6.m9016l(d76Var4);
                                    d76Var4.f16835j.m12505b(string3, "Unrecognized persisted bundle type. Type");
                                }
                            } else if (string3.equals("d")) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else {
                                d76 d76Var5 = oa6Var.f26514f;
                                oa6.m9016l(d76Var5);
                                d76Var5.f16835j.m12505b(string3, "Unrecognized persisted bundle type. Type");
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            d76 d76Var6 = oa6Var.f26514f;
                            oa6.m9016l(d76Var6);
                            d76Var6.f16835j.m12504a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f28987c = bundle;
                } catch (JSONException unused2) {
                    d76 d76Var7 = oa6Var.f26514f;
                    oa6.m9016l(d76Var7);
                    d76Var7.f16835j.m12504a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (((Bundle) this.f28987c) == null) {
                this.f28987c = (Bundle) this.f28985a;
            }
        }
        Bundle bundle2 = (Bundle) this.f28987c;
        y42.m12854a0(bundle2);
        return new Bundle(bundle2);
    }

    /* JADX INFO: renamed from: b */
    public aq5 m10191b(aq5 aq5Var) {
        return ((yg3) this.f28986b).m13122t(this, aq5Var);
    }

    /* JADX INFO: renamed from: c */
    public aq5 m10192c(r36 r36Var, mc6... mc6VarArr) {
        aq5 aq5VarM6933c = aq5.f14781np;
        for (mc6 mc6Var : mc6VarArr) {
            aq5VarM6933c = it5.m6933c(mc6Var);
            w76.m12166m((r36) this.f28987c);
            if ((aq5VarM6933c instanceof dq5) || (aq5VarM6933c instanceof vp5)) {
                aq5VarM6933c = ((yg3) this.f28986b).m13122t(r36Var, aq5VarM6933c);
            }
        }
        return aq5VarM6933c;
    }

    /* JADX INFO: renamed from: d */
    public e00 m10193d(ww5 ww5Var) throws n56 {
        int i;
        hu5 hu5Var;
        String str;
        mq5 mq5Var = (mq5) this.f28987c;
        fx5 fx5Var = (fx5) this.f28988d;
        int i2 = ww5Var.f33814g;
        mq5Var.f25152b.edit().putBoolean("is_pub_misconfigured", i2 == 8).commit();
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        int i4 = 3;
        switch (i3) {
            case 1:
            case 2:
            case 3:
                i = 3;
                break;
            case 4:
                i = 2;
                break;
            case 5:
                i = 1;
                break;
            case 6:
                throw new n56(1, "Invalid response from server: ".concat(String.valueOf(ww5Var.f33810c)));
            case 7:
                throw new n56(3, "Publisher misconfiguration: ".concat(String.valueOf(ww5Var.f33810c)));
            default:
                throw new n56(1, "Invalid response from server.");
        }
        int i5 = ww5Var.f33815h;
        int i6 = i5 - 1;
        if (i5 == 0) {
            throw null;
        }
        if (i6 != 1) {
            if (i6 != 2) {
                throw new n56(1, "Invalid response from server.");
            }
            i4 = 2;
        }
        String str2 = ww5Var.f33808a;
        if (str2 == null) {
            hu5Var = null;
        } else {
            String str3 = ww5Var.f33809b;
            hu5Var = new hu5();
            hu5Var.f20885a = str3;
            hu5Var.f20886b = str2;
            VarHandle.storeStoreFence();
        }
        fx5Var.f19393a.set(ww5Var.f33813f);
        mq5Var.f25152b.edit().putStringSet("stored_info", new HashSet(ww5Var.f33811d)).commit();
        for (vw5 vw5Var : ww5Var.f33812e) {
            int i7 = vw5Var.f32900b;
            int i8 = i7 - 1;
            if (i7 == 0) {
                throw null;
            }
            if (i8 == 0) {
                str = null;
            } else if (i8 == 1) {
                str = "write";
            } else {
                if (i8 != 2) {
                    throw new RuntimeException(null, null);
                }
                str = "clear";
            }
            if (str != null) {
                c16 c16Var = (c16) this.f28986b;
                String str4 = vw5Var.f32899a;
                wy5[] wy5VarArr = {(C1283w7) this.f28985a};
                c16Var.getClass();
                yn3 yn3Var = new yn3((byte) 5);
                yn3Var.f35360b = str;
                yn3Var.f35361c = str4;
                yn3Var.f35362d = wy5VarArr;
                VarHandle.storeStoreFence();
                c16Var.f15758a.execute(yn3Var);
            }
        }
        e00 e00Var = new e00();
        e00Var.f17552a = i;
        e00Var.f17553b = i4;
        e00Var.f17554c = hu5Var;
        VarHandle.storeStoreFence();
        return e00Var;
    }

    /* JADX INFO: renamed from: e */
    public aq5 m10194e(do5 do5Var) {
        aq5 aq5VarM13122t = aq5.f14781np;
        Iterator itM4627s = do5Var.m4627s();
        while (itM4627s.hasNext()) {
            aq5VarM13122t = ((yg3) this.f28986b).m13122t(this, do5Var.m4629u(((Integer) itM4627s.next()).intValue()));
            if (aq5VarM13122t instanceof po5) {
                break;
            }
        }
        return aq5VarM13122t;
    }

    /* JADX INFO: renamed from: f */
    public void m10195f(Bundle bundle) {
        s86 s86Var = (s86) this.f28988d;
        oa6 oa6Var = (oa6) s86Var.f36084a;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        SharedPreferences.Editor editorEdit = s86Var.m10560y().edit();
        int size = bundle2.size();
        String str = (String) this.f28986b;
        if (size == 0) {
            editorEdit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        ho6.m6466a();
                        if (oa6Var.f26512d.m9225E(null, e56.f17750Q0)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "d");
                            } else {
                                d76 d76Var = oa6Var.f26514f;
                                oa6.m9016l(d76Var);
                                d76Var.f16835j.m12505b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                d76 d76Var2 = oa6Var.f26514f;
                                oa6.m9016l(d76Var2);
                                d76Var2.f16835j.m12505b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e) {
                        d76 d76Var3 = oa6Var.f26514f;
                        oa6.m9016l(d76Var3);
                        d76Var3.f16835j.m12505b(e, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.f28987c = bundle2;
    }

    /* JADX INFO: renamed from: g */
    public r36 m10196g() {
        return new r36(this, (yg3) this.f28986b);
    }

    /* JADX INFO: renamed from: h */
    public boolean m10197h(String str) {
        if (((HashMap) this.f28987c).containsKey(str)) {
            return true;
        }
        r36 r36Var = (r36) this.f28985a;
        if (r36Var != null) {
            return r36Var.m10197h(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public void m10198i(String str, aq5 aq5Var) {
        r36 r36Var;
        HashMap map = (HashMap) this.f28987c;
        if (!map.containsKey(str) && (r36Var = (r36) this.f28985a) != null && r36Var.m10197h(str)) {
            r36Var.m10198i(str, aq5Var);
        } else {
            if (((HashMap) this.f28988d).containsKey(str)) {
                return;
            }
            if (aq5Var == null) {
                map.remove(str);
            } else {
                map.put(str, aq5Var);
            }
        }
    }

    @Override // p000.dr6
    /* JADX INFO: renamed from: j */
    public Object mo4146j() {
        mq5 mq5Var = (mq5) ((cr6) this.f28986b).mo4146j();
        wo5 wo5VarMo4146j = ((C1372yl) this.f28985a).mo4146j();
        gu5 gu5Var = (gu5) ((cr6) this.f28987c).mo4146j();
        fx5 fx5Var = (fx5) ((cr6) this.f28988d).mo4146j();
        dc6 dc6Var = new dc6();
        dc6Var.f16987d = new Object();
        dc6Var.f16988e = new Object();
        dc6Var.f16990g = false;
        dc6Var.f16991h = false;
        f70 f70Var = new f70((byte) 2);
        VarHandle.storeStoreFence();
        dc6Var.f16992i = f70Var;
        dc6Var.f16984a = mq5Var;
        dc6Var.f16985b = wo5VarMo4146j;
        dc6Var.f16986c = gu5Var;
        dc6Var.f16989f = fx5Var;
        VarHandle.storeStoreFence();
        return dc6Var;
    }

    /* JADX INFO: renamed from: k */
    public void m10199k(String str, aq5 aq5Var) {
        if (((HashMap) this.f28988d).containsKey(str)) {
            return;
        }
        HashMap map = (HashMap) this.f28987c;
        if (aq5Var == null) {
            map.remove(str);
        } else {
            map.put(str, aq5Var);
        }
    }

    /* JADX INFO: renamed from: l */
    public aq5 m10200l(String str) {
        HashMap map = (HashMap) this.f28987c;
        if (map.containsKey(str)) {
            return (aq5) map.get(str);
        }
        r36 r36Var = (r36) this.f28985a;
        if (r36Var != null) {
            return r36Var.m10200l(str);
        }
        throw new IllegalArgumentException(str + " is not defined");
    }

    public r36(s86 s86Var, String str) {
        this.f28988d = s86Var;
        y42.m12851X(str);
        this.f28986b = str;
        this.f28985a = new Bundle();
    }
}
