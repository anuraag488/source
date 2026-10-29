package p000;

import ads_mobile_sdk.C0213l2;
import ads_mobile_sdk.ys0;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.io.Serializable;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class g76 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f19642a = 0;

    /* JADX INFO: renamed from: b */
    public long f19643b;

    /* JADX INFO: renamed from: c */
    public Object f19644c;

    /* JADX INFO: renamed from: d */
    public Object f19645d;

    /* JADX INFO: renamed from: e */
    public Object f19646e;

    public g76(C0213l2 c0213l2, ys0 ys0Var, long j, Integer num) {
        this.f19644c = c0213l2;
        this.f19645d = ys0Var;
        this.f19643b = j;
        this.f19646e = num;
    }

    /* JADX INFO: renamed from: a */
    public static g76 m5911a(ys5 ys5Var) {
        String str = ys5Var.f35504d;
        String str2 = ys5Var.f35506f;
        Bundle bundleM9261d = ys5Var.f35505e.m9261d();
        long j = ys5Var.f35507g;
        g76 g76Var = new g76();
        g76Var.f19644c = str;
        g76Var.f19645d = str2;
        g76Var.f19646e = bundleM9261d;
        g76Var.f19643b = j;
        VarHandle.storeStoreFence();
        return g76Var;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00fe A[PHI: r7 r16 r17
  0x00fe: PHI (r7v1 android.database.Cursor) = (r7v2 android.database.Cursor), (r7v4 android.database.Cursor) binds: [B:61:0x0129, B:46:0x00f7] A[DONT_GENERATE, DONT_INLINE]
  0x00fe: PHI (r16v5 m96) = (r16v7 m96), (r16v11 m96) binds: [B:61:0x0129, B:46:0x00f7] A[DONT_GENERATE, DONT_INLINE]
  0x00fe: PHI (r17v2 long) = (r17v4 long), (r17v7 long) binds: [B:61:0x0129, B:46:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public m96 m5912b(String str, m96 m96Var) throws Throwable {
        Cursor cursor;
        m96 m96Var2;
        long j;
        Cursor cursorRawQuery;
        Pair pair;
        Object obj;
        Pair pair2;
        String strM8247r = m96Var.m8247r();
        List listM8244o = m96Var.m8244o();
        vn5 vn5Var = (vn5) this.f19646e;
        qm6 qm6Var = vn5Var.f19870f;
        oa6 oa6Var = (oa6) vn5Var.f36084a;
        qm6Var.m9958i0();
        x96 x96VarM9761C = q76.m9761C("_eid", m96Var);
        Long l = (Long) (x96VarM9761C == null ? null : q76.m9766J(x96VarM9761C));
        if (l != null) {
            if (strM8247r.equals("_ep")) {
                qm6Var.m9958i0();
                x96 x96VarM9761C2 = q76.m9761C("_en", m96Var);
                String str2 = (String) (x96VarM9761C2 == null ? null : q76.m9766J(x96VarM9761C2));
                if (TextUtils.isEmpty(str2)) {
                    d76 d76Var = oa6Var.f26514f;
                    oa6.m9016l(d76Var);
                    d76Var.f16836k.m12505b(l, "Extra parameter without an event name. eventId");
                    return null;
                }
                if (((m96) this.f19644c) == null || ((Long) this.f19645d) == null || l.longValue() != ((Long) this.f19645d).longValue()) {
                    ar5 ar5Var = qm6Var.f28593c;
                    qm6.m9925S(ar5Var);
                    oa6 oa6Var2 = (oa6) ar5Var.f36084a;
                    ar5Var.mo5038t();
                    ar5Var.m10368u();
                    try {
                        cursorRawQuery = ar5Var.m3197l0().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l.toString()});
                        try {
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    m96Var2 = null;
                                    try {
                                        try {
                                            Pair pairCreate = Pair.create((m96) ((l96) q76.m9777k0(m96.m8235y(), cursorRawQuery.getBlob(0))).m11056e(), Long.valueOf(cursorRawQuery.getLong(1)));
                                            cursorRawQuery.close();
                                            pair2 = pairCreate;
                                        } catch (IOException e) {
                                            d76 d76Var2 = oa6Var2.f26514f;
                                            oa6.m9016l(d76Var2);
                                            j = 0;
                                            try {
                                                d76Var2.f16835j.m12507d("Failed to merge main event. appId, eventId", d76.m4401y(str), l, e);
                                            } catch (SQLiteException e2) {
                                                e = e2;
                                                d76 d76Var3 = oa6Var2.f26514f;
                                                oa6.m9016l(d76Var3);
                                                d76Var3.f16835j.m12505b(e, "Error selecting main event");
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                pair = m96Var2;
                                                if (pair != 0) {
                                                }
                                                d76 d76Var4 = oa6Var.f26514f;
                                                oa6.m9016l(d76Var4);
                                                d76Var4.f16836k.m12506c("Extra parameter without existing main event. eventName, eventId", str2, l);
                                                return m96Var2;
                                            }
                                            cursorRawQuery.close();
                                            pair = m96Var2;
                                        }
                                    } catch (SQLiteException e3) {
                                        e = e3;
                                        j = 0;
                                        d76 d76Var5 = oa6Var2.f26514f;
                                        oa6.m9016l(d76Var5);
                                        d76Var5.f16835j.m12505b(e, "Error selecting main event");
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        pair = m96Var2;
                                    }
                                } else {
                                    d76 d76Var6 = oa6Var2.f26514f;
                                    oa6.m9016l(d76Var6);
                                    d76Var6.f16831L.m12504a("Main event not found");
                                    cursorRawQuery.close();
                                    pair2 = null;
                                    m96Var2 = null;
                                }
                                j = 0;
                                pair = pair2;
                            } catch (Throwable th) {
                                th = th;
                                cursor = cursorRawQuery;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e4) {
                            e = e4;
                            m96Var2 = null;
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        m96Var2 = null;
                        j = 0;
                        cursorRawQuery = null;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = null;
                    }
                    if (pair != 0 || (obj = pair.first) == null) {
                        d76 d76Var7 = oa6Var.f26514f;
                        oa6.m9016l(d76Var7);
                        d76Var7.f16836k.m12506c("Extra parameter without existing main event. eventName, eventId", str2, l);
                        return m96Var2;
                    }
                    this.f19644c = (m96) obj;
                    this.f19643b = ((Long) pair.second).longValue();
                    qm6Var.m9958i0();
                    this.f19645d = (Long) q76.m9762D("_eid", (m96) this.f19644c);
                } else {
                    j = 0;
                }
                long j2 = this.f19643b - 1;
                this.f19643b = j2;
                if (j2 <= j) {
                    ar5 ar5Var2 = qm6Var.f28593c;
                    qm6.m9925S(ar5Var2);
                    oa6 oa6Var3 = (oa6) ar5Var2.f36084a;
                    ar5Var2.mo5038t();
                    d76 d76Var8 = oa6Var3.f26514f;
                    oa6.m9016l(d76Var8);
                    d76Var8.f16831L.m12505b(str, "Clearing complex main event info. appId");
                    try {
                        ar5Var2.m3197l0().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e6) {
                        d76 d76Var9 = oa6Var3.f26514f;
                        oa6.m9016l(d76Var9);
                        d76Var9.f16835j.m12505b(e6, "Error clearing complex main event");
                    }
                } else {
                    ar5 ar5Var3 = qm6Var.f28593c;
                    qm6.m9925S(ar5Var3);
                    ar5Var3.m3175N(str, l, this.f19643b, (m96) this.f19644c);
                }
                ArrayList arrayList = new ArrayList();
                for (x96 x96Var : ((m96) this.f19644c).m8244o()) {
                    qm6Var.m9958i0();
                    if (q76.m9761C(x96Var.m12547p(), m96Var) == null) {
                        arrayList.add(x96Var);
                    }
                }
                if (arrayList.isEmpty()) {
                    d76 d76Var10 = oa6Var.f26514f;
                    oa6.m9016l(d76Var10);
                    d76Var10.f16836k.m12505b(str2, "No unique parameters in main event. eventName");
                } else {
                    arrayList.addAll(listM8244o);
                    listM8244o = arrayList;
                }
                strM8247r = str2;
            } else {
                this.f19645d = l;
                this.f19644c = m96Var;
                qm6Var.m9958i0();
                x96 x96VarM9761C3 = q76.m9761C("_epc", m96Var);
                Serializable serializableM9766J = x96VarM9761C3 != null ? q76.m9766J(x96VarM9761C3) : null;
                long jLongValue = ((Long) (serializableM9766J != null ? serializableM9766J : 0L)).longValue();
                this.f19643b = jLongValue;
                if (jLongValue <= 0) {
                    d76 d76Var11 = oa6Var.f26514f;
                    oa6.m9016l(d76Var11);
                    d76Var11.f16836k.m12505b(strM8247r, "Complex event with zero extra param count. eventName");
                } else {
                    ar5 ar5Var4 = qm6Var.f28593c;
                    qm6.m9925S(ar5Var4);
                    ar5Var4.m3175N(str, l, this.f19643b, m96Var);
                }
            }
        }
        l96 l96Var = (l96) m96Var.m13569g();
        l96Var.m11054c();
        ((m96) l96Var.f31181b).m8240E(strM8247r);
        l96Var.m11054c();
        ((m96) l96Var.f31181b).m8238C();
        l96Var.m11054c();
        ((m96) l96Var.f31181b).m8237B(listM8244o);
        return (m96) l96Var.m11056e();
    }

    /* JADX INFO: renamed from: c */
    public ys5 m5913c() {
        return new ys5((String) this.f19644c, new os5(new Bundle((Bundle) this.f19646e)), (String) this.f19645d, this.f19643b);
    }

    public String toString() {
        switch (this.f19642a) {
            case 0:
                String str = (String) this.f19645d;
                String string = ((Bundle) this.f19646e).toString();
                int length = String.valueOf(str).length();
                String str2 = (String) this.f19644c;
                StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
                zi4.m13599B(sb, "origin=", str, ",name=", str2);
                return zi4.m13623w(sb, ",params=", string);
            case 1:
                return AbstractC1356y5.m12913g((C0213l2) this.f19644c, (ys0) this.f19645d, this.f19643b, (Integer) this.f19646e);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ g76(vn5 vn5Var) {
        this.f19646e = vn5Var;
    }

    public /* synthetic */ g76() {
    }
}
