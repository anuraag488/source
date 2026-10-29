package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ck0 implements xm0, cg4, n60, e43, nt3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f16073a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f16074b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f16075c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f16076d;

    public /* synthetic */ ck0(byte b) {
        this.f16073a = b;
    }

    @Override // p000.nt3
    public Object apply(Object obj) {
        int i;
        long jInsert;
        pt3 pt3Var;
        byte b = this.f16073a;
        ln2 ln2Var = ln2.f24200d;
        int i2 = 5;
        int i3 = 3;
        int i4 = 2;
        int i5 = 4;
        byte b2 = 0;
        byte b3 = 1;
        switch (b) {
            case 6:
                pt3 pt3Var2 = (pt3) this.f16074b;
                HashMap map = (HashMap) this.f16075c;
                C1283w7 c1283w7 = (C1283w7) this.f16076d;
                Cursor cursor = (Cursor) obj;
                pt3Var2.getClass();
                while (cursor.moveToNext()) {
                    String string = cursor.getString(0);
                    int i6 = cursor.getInt(1);
                    ln2 ln2Var2 = ln2.f24198b;
                    if (i6 != 0) {
                        if (i6 == 1) {
                            ln2Var2 = ln2.f24199c;
                        } else if (i6 == 2) {
                            ln2Var2 = ln2Var;
                            i = 2;
                        } else if (i6 == 3) {
                            ln2Var2 = ln2.f24201e;
                        } else if (i6 == 4) {
                            ln2Var2 = ln2.f24202f;
                        } else if (i6 == 5) {
                            ln2Var2 = ln2.f24203g;
                            i = 2;
                        } else {
                            if (i6 == 6) {
                                ln2Var2 = ln2.f24204h;
                            } else {
                                se0.m10736q("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i6));
                            }
                            i = 2;
                        }
                        i = 2;
                    } else {
                        i = 2;
                    }
                    long j = cursor.getLong(i);
                    if (!map.containsKey(string)) {
                        map.put(string, new ArrayList());
                    }
                    List list = (List) map.get(string);
                    mn2 mn2Var = new mn2();
                    mn2Var.f25063a = j;
                    mn2Var.f25064b = ln2Var2;
                    VarHandle.storeStoreFence();
                    list.add(mn2Var);
                }
                for (Map.Entry entry : map.entrySet()) {
                    int i7 = on2.f26909c;
                    new ArrayList();
                    String str = (String) entry.getKey();
                    List listUnmodifiableList = Collections.unmodifiableList((List) entry.getValue());
                    on2 on2Var = new on2();
                    on2Var.f26910a = str;
                    on2Var.f26911b = listUnmodifiableList;
                    VarHandle.storeStoreFence();
                    ((ArrayList) c1283w7.f33128d).add(on2Var);
                }
                long jMo5609j = pt3Var2.f27973b.mo5609j();
                SQLiteDatabase sQLiteDatabaseM9671a = pt3Var2.m9671a();
                sQLiteDatabaseM9671a.beginTransaction();
                try {
                    Cursor cursorRawQuery = sQLiteDatabaseM9671a.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    kt3 kt3Var = new kt3();
                    kt3Var.f23429a = jMo5609j;
                    VarHandle.storeStoreFence();
                    wm4 wm4Var = (wm4) pt3.m9670q(cursorRawQuery, kt3Var);
                    sQLiteDatabaseM9671a.setTransactionSuccessful();
                    sQLiteDatabaseM9671a.endTransaction();
                    c1283w7.f33127c = wm4Var;
                    long jSimpleQueryForLong = pt3Var2.m9671a().compileStatement("PRAGMA page_size").simpleQueryForLong() * pt3Var2.m9671a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                    long j2 = C0504bu.f15597f.f15598a;
                    tc4 tc4Var = new tc4();
                    tc4Var.f31074a = jSimpleQueryForLong;
                    tc4Var.f31075b = j2;
                    VarHandle.storeStoreFence();
                    ms1 ms1Var = new ms1();
                    ms1Var.f25179a = tc4Var;
                    VarHandle.storeStoreFence();
                    c1283w7.f33129e = ms1Var;
                    c1283w7.f33126b = (String) pt3Var2.f27976e.get();
                    wm4 wm4Var2 = (wm4) c1283w7.f33127c;
                    List listUnmodifiableList2 = Collections.unmodifiableList((ArrayList) c1283w7.f33128d);
                    ms1 ms1Var2 = (ms1) c1283w7.f33129e;
                    String str2 = (String) c1283w7.f33126b;
                    ea0 ea0Var = new ea0();
                    ea0Var.f17918a = wm4Var2;
                    ea0Var.f17919b = listUnmodifiableList2;
                    ea0Var.f17920c = ms1Var2;
                    ea0Var.f17921d = str2;
                    VarHandle.storeStoreFence();
                    return ea0Var;
                } catch (Throwable th) {
                    sQLiteDatabaseM9671a.endTransaction();
                    throw th;
                }
            case 7:
                pt3 pt3Var3 = (pt3) this.f16074b;
                C0467au c0467au = (C0467au) this.f16075c;
                C0588dv c0588dv = (C0588dv) this.f16076d;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long jSimpleQueryForLong2 = pt3Var3.m9671a().compileStatement("PRAGMA page_size").simpleQueryForLong() * pt3Var3.m9671a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                C0504bu c0504bu = pt3Var3.f27975d;
                if (jSimpleQueryForLong2 >= c0504bu.f15598a) {
                    pt3Var3.m9674j(1L, ln2Var, c0467au.f14865a);
                    return -1L;
                }
                Long lM9668b = pt3.m9668b(sQLiteDatabase, c0588dv);
                if (lM9668b != null) {
                    jInsert = lM9668b.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", c0588dv.f17420a);
                    contentValues.put("priority", Integer.valueOf(bg3.m3588a(c0588dv.f17422c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = c0588dv.f17421b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i8 = c0504bu.f15602e;
                byte[] bArr2 = c0467au.f14867c.f18835b;
                boolean z = bArr2.length <= i8;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", c0467au.f14865a);
                contentValues2.put("timestamp_ms", Long.valueOf(c0467au.f14868d));
                contentValues2.put("uptime_ms", Long.valueOf(c0467au.f14869e));
                contentValues2.put("payload_encoding", c0467au.f14867c.f18834a.f22086a);
                contentValues2.put("code", c0467au.f14866b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr2 : new byte[0]);
                contentValues2.put("product_id", c0467au.f14871g);
                contentValues2.put("pseudonymous_id", c0467au.f14872h);
                contentValues2.put("experiment_ids_clear_blob", c0467au.f14873i);
                contentValues2.put("experiment_ids_encrypted_blob", c0467au.f14874j);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) i8));
                    for (int i9 = 1; i9 <= iCeil; i9++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i9 - 1) * i8, Math.min(i9 * i8, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i9));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry2 : Collections.unmodifiableMap(c0467au.f14870f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry2.getKey());
                    contentValues4.put("value", (String) entry2.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            default:
                pt3 pt3Var4 = (pt3) this.f16074b;
                ArrayList arrayList = (ArrayList) this.f16075c;
                C0588dv c0588dv2 = (C0588dv) this.f16076d;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j3 = cursor2.getLong(b2);
                    byte b4 = cursor2.getInt(7) != 0 ? b3 : b2;
                    C0940nb c0940nb = new C0940nb(b3);
                    c0940nb.f25610g = new HashMap();
                    String string2 = cursor2.getString(b3);
                    if (string2 == null) {
                        xy4.m12782k("Null transportName");
                        return null;
                    }
                    c0940nb.f25605b = string2;
                    c0940nb.f25608e = Long.valueOf(cursor2.getLong(i4));
                    c0940nb.f25609f = Long.valueOf(cursor2.getLong(i3));
                    if (b4 != 0) {
                        String string3 = cursor2.getString(i5);
                        c0940nb.f25607d = new f81(string3 == null ? pt3.f27971f : j81.m7046a(string3), cursor2.getBlob(i2));
                        pt3Var = pt3Var4;
                    } else {
                        String string4 = cursor2.getString(i5);
                        j81 j81VarM7046a = string4 == null ? pt3.f27971f : j81.m7046a(string4);
                        Cursor cursorQuery = pt3Var4.m9671a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j3)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int length = b2;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(b2);
                                arrayList2.add(blob);
                                length += blob.length;
                            }
                            byte[] bArr3 = new byte[length];
                            int i10 = b2;
                            int length2 = i10;
                            while (i10 < arrayList2.size()) {
                                byte[] bArr4 = (byte[]) arrayList2.get(i10);
                                pt3 pt3Var5 = pt3Var4;
                                ArrayList arrayList3 = arrayList2;
                                System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
                                length2 += bArr4.length;
                                i10++;
                                arrayList2 = arrayList3;
                                pt3Var4 = pt3Var5;
                            }
                            pt3Var = pt3Var4;
                            cursorQuery.close();
                            c0940nb.f25607d = new f81(j81VarM7046a, bArr3);
                        } catch (Throwable th2) {
                            cursorQuery.close();
                            throw th2;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        c0940nb.f25606c = Integer.valueOf(cursor2.getInt(6));
                    }
                    if (!cursor2.isNull(8)) {
                        c0940nb.f25611h = Integer.valueOf(cursor2.getInt(8));
                    }
                    if (!cursor2.isNull(9)) {
                        c0940nb.f25612i = cursor2.getString(9);
                    }
                    if (!cursor2.isNull(10)) {
                        c0940nb.f25613j = cursor2.getBlob(10);
                    }
                    if (!cursor2.isNull(11)) {
                        c0940nb.f25614k = cursor2.getBlob(11);
                    }
                    arrayList.add(C1010ou.m9267a(j3, c0588dv2, c0940nb.m8669e()));
                    pt3Var4 = pt3Var;
                    i2 = 5;
                    i3 = 3;
                    i4 = 2;
                    i5 = 4;
                    b2 = 0;
                    b3 = 1;
                }
                return null;
        }
    }

    @Override // p000.cg4
    /* JADX INFO: renamed from: d */
    public Object mo4024d() {
        qw0 qw0Var = (qw0) this.f16074b;
        C0588dv c0588dv = (C0588dv) this.f16075c;
        C0467au c0467au = (C0467au) this.f16076d;
        pt3 pt3Var = qw0Var.f28845d;
        pt3Var.getClass();
        ag3 ag3Var = c0588dv.f17422c;
        String str = c0467au.f14865a;
        String str2 = c0588dv.f17420a;
        if (Log.isLoggable("TRuntime.SQLiteEventStore", 3)) {
            Log.d("TRuntime.SQLiteEventStore", "Storing event with priority=" + ag3Var + ", name=" + str + " for destination " + str2);
        }
        ck0 ck0Var = new ck0((byte) 7);
        ck0Var.f16074b = pt3Var;
        ck0Var.f16075c = c0467au;
        ck0Var.f16076d = c0588dv;
        VarHandle.storeStoreFence();
        long jLongValue = ((Long) pt3Var.m9672e(ck0Var)).longValue();
        if (jLongValue >= 1) {
            C1010ou.m9267a(jLongValue, c0588dv, c0467au);
        }
        qw0Var.f28842a.m7224N(c0588dv, 1, false);
        return null;
    }

    @Override // p000.n60
    /* JADX INFO: renamed from: f */
    public Object mo4036f(m60 m60Var) {
        ro0 ro0Var = (ro0) this.f16074b;
        cp0 cp0Var = (cp0) this.f16075c;
        f35 f35Var = (f35) this.f16076d;
        t82 t82Var = (t82) ro0Var.get(o85.f26448h);
        RunnableC1054q0 runnableC1054q0 = new RunnableC1054q0((byte) 11);
        runnableC1054q0.f28115b = t82Var;
        VarHandle.storeStoreFence();
        tz0 tz0Var = tz0.f31554a;
        no3 no3Var = m60Var.f24680c;
        if (no3Var != null) {
            no3Var.mo6454a(runnableC1054q0, tz0Var);
        }
        return lb5.m7910S(zp0.m13670b(ro0Var), null, cp0Var, new C0671g0((Object) f35Var, (Object) m60Var, (wm0) null, (byte) 29), 1);
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: h */
    public Object mo3681h(nr6 nr6Var) {
        wj0 wj0Var;
        URL url = null;
        switch (this.f16073a) {
            case 0:
                ek0 ek0Var = (ek0) this.f16074b;
                nr6 nr6Var2 = (nr6) this.f16075c;
                nr6 nr6Var3 = (nr6) this.f16076d;
                ek0Var.getClass();
                if (!nr6Var2.m8826j()) {
                    return y62.m12935A(new xg1("Firebase Installations failed to get installation auth token for config update listener connection.", nr6Var2.m8823g()));
                }
                if (!nr6Var3.m8826j()) {
                    return y62.m12935A(new xg1("Firebase Installations failed to get installation ID for config update listener connection.", nr6Var3.m8823g()));
                }
                try {
                    try {
                        url = new URL(ek0Var.m5142c(ek0Var.f18164n));
                    } catch (MalformedURLException unused) {
                        Log.e("FirebaseRemoteConfig", "URL is malformed");
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    ek0Var.m5146i(httpURLConnection, (String) nr6Var3.m8824h(), ((C0774iu) nr6Var2.m8824h()).f21777a);
                    return y62.m12936B(httpURLConnection);
                } catch (IOException e) {
                    return y62.m12935A(new xg1("Failed to open HTTP stream connection", e));
                }
            case 1:
                li4 li4Var = (li4) this.f16074b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f16075c;
                js1 js1Var = (js1) this.f16076d;
                if (nr6Var.m8826j()) {
                    li4Var.m7990c(nr6Var.m8824h());
                } else if (nr6Var.m8823g() != null) {
                    li4Var.m7989b(nr6Var.m8823g());
                } else if (atomicBoolean.getAndSet(true)) {
                    ((nr6) ((rr5) js1Var.f22555a).f29555b).m8829m(null);
                }
                return y62.m12936B(null);
            default:
                wg1 wg1Var = (wg1) this.f16074b;
                nr6 nr6Var4 = (nr6) this.f16075c;
                nr6 nr6Var5 = (nr6) this.f16076d;
                if (!nr6Var4.m8826j() || nr6Var4.m8824h() == null) {
                    return y62.m12936B(Boolean.FALSE);
                }
                wj0 wj0Var2 = (wj0) nr6Var4.m8824h();
                if (nr6Var5.m8826j() && (wj0Var = (wj0) nr6Var5.m8824h()) != null && wj0Var2.f33418c.equals(wj0Var.f33418c)) {
                    return y62.m12936B(Boolean.FALSE);
                }
                nr6 nr6VarM11573d = wg1Var.f33359d.m11573d(wj0Var2);
                Executor executor = wg1Var.f33357b;
                vg1 vg1Var = new vg1();
                vg1Var.f32593a = wg1Var;
                VarHandle.storeStoreFence();
                return nr6VarM11573d.m8821e(executor, vg1Var);
        }
    }

    @Override // p000.e43
    public void onSuccess(Object obj) {
        C1283w7 c1283w7 = (C1283w7) this.f16074b;
        nr6 nr6Var = (nr6) this.f16075c;
        tp0 tp0Var = (tp0) this.f16076d;
        c1283w7.getClass();
        try {
            wj0 wj0Var = (wj0) nr6Var.m8824h();
            if (wj0Var != null) {
                C1232uu c1232uuM9606d = ((pq3) c1283w7.f33128d).m9606d(wj0Var);
                Executor executor = (Executor) c1283w7.f33129e;
                qq3 qq3Var = new qq3((byte) 0);
                qq3Var.f28692b = tp0Var;
                qq3Var.f28693c = c1232uuM9606d;
                VarHandle.storeStoreFence();
                executor.execute(qq3Var);
            }
        } catch (yg1 e) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e);
        }
    }
}
