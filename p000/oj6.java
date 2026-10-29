package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class oj6 extends q56 {

    /* JADX INFO: renamed from: g */
    public jj6 f26788g;

    /* JADX INFO: renamed from: h */
    public s56 f26789h;

    /* JADX INFO: renamed from: i */
    public volatile Boolean f26790i;

    /* JADX INFO: renamed from: j */
    public ji6 f26791j;

    /* JADX INFO: renamed from: k */
    public ScheduledExecutorService f26792k;

    /* JADX INFO: renamed from: l */
    public al6 f26793l;

    /* JADX INFO: renamed from: m */
    public ArrayList f26794m;

    /* JADX INFO: renamed from: n */
    public ji6 f26795n;

    /* JADX INFO: renamed from: A */
    public final void m9132A() {
        mo5038t();
        m9741u();
        if (m9143M()) {
            return;
        }
        if (m9133B()) {
            jj6 jj6Var = this.f26788g;
            oj6 oj6Var = jj6Var.f22344c;
            oj6Var.mo5038t();
            Context context = ((oa6) oj6Var.f36084a).f26509a;
            synchronized (jj6Var) {
                try {
                    if (jj6Var.f22342a) {
                        d76 d76Var = ((oa6) jj6Var.f22344c.f36084a).f26514f;
                        oa6.m9016l(d76Var);
                        d76Var.f16831L.m12504a("Connection attempt already in progress");
                        return;
                    } else {
                        if (jj6Var.f22343b != null && (jj6Var.f22343b.isConnecting() || jj6Var.f22343b.isConnected())) {
                            d76 d76Var2 = ((oa6) jj6Var.f22344c.f36084a).f26514f;
                            oa6.m9016l(d76Var2);
                            d76Var2.f16831L.m12504a("Already awaiting connection attempt");
                            return;
                        }
                        jj6Var.f22343b = new ue5(context, Looper.getMainLooper(), 93, jj6Var, jj6Var, (byte) 1);
                        d76 d76Var3 = ((oa6) jj6Var.f22344c.f36084a).f26514f;
                        oa6.m9016l(d76Var3);
                        d76Var3.f16831L.m12504a("Connecting to remote service");
                        jj6Var.f22342a = true;
                        y42.m12854a0(jj6Var.f22343b);
                        jj6Var.f22343b.checkAvailabilityAndConnect();
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        oa6 oa6Var = (oa6) this.f36084a;
        if (oa6Var.f26512d.m9233x()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = oa6Var.f26509a.getPackageManager().queryIntentServices(new Intent().setClassName(oa6Var.f26509a, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            d76 d76Var4 = oa6Var.f26514f;
            oa6.m9016l(d76Var4);
            d76Var4.f16835j.m12504a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(oa6Var.f26509a, "com.google.android.gms.measurement.AppMeasurementService"));
        jj6 jj6Var2 = this.f26788g;
        oj6 oj6Var2 = jj6Var2.f22344c;
        oj6Var2.mo5038t();
        Context context2 = ((oa6) oj6Var2.f36084a).f26509a;
        ar3 ar3VarM3128s = ar3.m3128s();
        synchronized (jj6Var2) {
            try {
                boolean z = jj6Var2.f22342a;
                oj6 oj6Var3 = jj6Var2.f22344c;
                oa6 oa6Var2 = (oa6) oj6Var3.f36084a;
                if (z) {
                    d76 d76Var5 = oa6Var2.f26514f;
                    oa6.m9016l(d76Var5);
                    d76Var5.f16831L.m12504a("Connection attempt already in progress");
                } else {
                    d76 d76Var6 = oa6Var2.f26514f;
                    oa6.m9016l(d76Var6);
                    d76Var6.f16831L.m12504a("Using local app measurement service");
                    jj6Var2.f22342a = true;
                    ar3VarM3128s.m3134E(context2, context2.getClass().getName(), intent, oj6Var3.f26788g, 129, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final boolean m9133B() {
        mo5038t();
        m9741u();
        if (this.f26790i == null) {
            mo5038t();
            m9741u();
            oa6 oa6Var = (oa6) this.f36084a;
            s86 s86Var = oa6Var.f26513e;
            oa6.m9014j(s86Var);
            s86Var.mo5038t();
            boolean z = false;
            Boolean boolValueOf = !s86Var.m10560y().contains("use_service") ? null : Boolean.valueOf(s86Var.m10560y().getBoolean("use_service", false));
            boolean z2 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                e66 e66VarM9029p = ((oa6) this.f36084a).m9029p();
                e66VarM9029p.m9741u();
                if (e66VarM9029p.f17860q == 1) {
                    z = true;
                } else {
                    d76 d76Var = oa6Var.f26514f;
                    oa6.m9016l(d76Var);
                    d76Var.f16831L.m12504a("Checking service availability");
                    dn6 dn6Var = oa6Var.f26517i;
                    oa6.m9014j(dn6Var);
                    int iM10123b = qt1.f28785b.m10123b(((oa6) dn6Var.f36084a).f26509a, 12451000);
                    if (iM10123b == 0) {
                        d76 d76Var2 = oa6Var.f26514f;
                        oa6.m9016l(d76Var2);
                        d76Var2.f16831L.m12504a("Service available");
                    } else if (iM10123b == 1) {
                        d76 d76Var3 = oa6Var.f26514f;
                        oa6.m9016l(d76Var3);
                        d76Var3.f16831L.m12504a("Service missing");
                    } else if (iM10123b != 2) {
                        if (iM10123b != 3) {
                            d76 d76Var4 = oa6Var.f26514f;
                            if (iM10123b == 9) {
                                oa6.m9016l(d76Var4);
                                d76Var4.f16838m.m12504a("Service invalid");
                            } else if (iM10123b != 18) {
                                oa6.m9016l(d76Var4);
                                d76Var4.f16838m.m12505b(Integer.valueOf(iM10123b), "Unexpected service status");
                            } else {
                                oa6.m9016l(d76Var4);
                                d76Var4.f16838m.m12504a("Service updating");
                            }
                        } else {
                            d76 d76Var5 = oa6Var.f26514f;
                            oa6.m9016l(d76Var5);
                            d76Var5.f16838m.m12504a("Service disabled");
                        }
                        z2 = false;
                    } else {
                        d76 d76Var6 = oa6Var.f26514f;
                        oa6.m9016l(d76Var6);
                        d76Var6.f16842q.m12504a("Service container out of date");
                        dn6 dn6Var2 = oa6Var.f26517i;
                        oa6.m9014j(dn6Var2);
                        if (dn6Var2.m4601a0() >= 17443) {
                            z = boolValueOf == null;
                            z2 = false;
                        }
                    }
                    z = true;
                }
                if (!z && oa6Var.f26512d.m9233x()) {
                    d76 d76Var7 = oa6Var.f26514f;
                    oa6.m9016l(d76Var7);
                    d76Var7.f16835j.m12504a("No way to upload. Consider using the full version of Analytics");
                } else if (z2) {
                    s86 s86Var2 = oa6Var.f26513e;
                    oa6.m9014j(s86Var2);
                    s86Var2.mo5038t();
                    SharedPreferences.Editor editorEdit = s86Var2.m10560y().edit();
                    editorEdit.putBoolean("use_service", z);
                    editorEdit.apply();
                }
                z2 = z;
            }
            this.f26790i = Boolean.valueOf(z2);
        }
        return this.f26790i.booleanValue();
    }

    /* JADX INFO: renamed from: C */
    public final void m9134C() {
        mo5038t();
        m9741u();
        jj6 jj6Var = this.f26788g;
        if (jj6Var.f22343b != null && (jj6Var.f22343b.isConnected() || jj6Var.f22343b.isConnecting())) {
            jj6Var.f22343b.disconnect();
        }
        jj6Var.f22343b = null;
        try {
            ar3.m3128s().m3131B(((oa6) this.f36084a).f26509a, jj6Var);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f26789h = null;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m9135E() {
        mo5038t();
        m9741u();
        if (!m9133B()) {
            return true;
        }
        dn6 dn6Var = ((oa6) this.f36084a).f26517i;
        oa6.m9014j(dn6Var);
        return dn6Var.m4601a0() >= ((Integer) e56.f17736J0.m4379a(null)).intValue();
    }

    /* JADX INFO: renamed from: F */
    public final boolean m9136F() {
        mo5038t();
        m9741u();
        if (!m9133B()) {
            return true;
        }
        dn6 dn6Var = ((oa6) this.f36084a).f26517i;
        oa6.m9014j(dn6Var);
        return dn6Var.m4601a0() >= 241200;
    }

    /* JADX INFO: renamed from: G */
    public final void m9137G(ComponentName componentName) {
        mo5038t();
        if (this.f26789h != null) {
            this.f26789h = null;
            d76 d76Var = ((oa6) this.f36084a).f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16831L.m12505b(componentName, "Disconnected from device MeasurementService");
            mo5038t();
            m9132A();
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m9138H() {
        ((oa6) this.f36084a).getClass();
    }

    /* JADX INFO: renamed from: I */
    public final void m9139I() {
        mo5038t();
        al6 al6Var = this.f26793l;
        al6Var.getClass();
        al6Var.f14618a = SystemClock.elapsedRealtime();
        op5 op5Var = ((oa6) this.f36084a).f26512d;
        this.f26791j.m6923b(((Long) e56.f17765Y.m4379a(null)).longValue());
    }

    /* JADX INFO: renamed from: J */
    public final void m9140J(Runnable runnable) {
        mo5038t();
        if (m9143M()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f26794m;
        long size = arrayList.size();
        oa6 oa6Var = (oa6) this.f36084a;
        op5 op5Var = oa6Var.f26512d;
        if (size >= 1000) {
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16835j.m12504a("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.f26795n.m6923b(60000L);
            m9132A();
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m9141K() {
        mo5038t();
        oa6 oa6Var = (oa6) this.f36084a;
        d76 d76Var = oa6Var.f26514f;
        oa6.m9016l(d76Var);
        x66 x66Var = d76Var.f16831L;
        ArrayList arrayList = this.f26794m;
        x66Var.m12505b(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            try {
                ((Runnable) obj).run();
            } catch (RuntimeException e) {
                d76 d76Var2 = oa6Var.f26514f;
                oa6.m9016l(d76Var2);
                d76Var2.f16835j.m12505b(e, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.f26795n.m6924c();
    }

    /* JADX INFO: renamed from: L */
    public final cp6 m9142L(boolean z) {
        long jAbs;
        Pair pair;
        oa6 oa6Var = (oa6) this.f36084a;
        oa6Var.getClass();
        e66 e66VarM9029p = oa6Var.m9029p();
        String strM3881m = null;
        if (z) {
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            oa6 oa6Var2 = (oa6) d76Var.f36084a;
            s86 s86Var = oa6Var2.f26513e;
            oa6.m9014j(s86Var);
            if (s86Var.f29987i != null) {
                s86 s86Var2 = oa6Var2.f26513e;
                oa6.m9014j(s86Var2);
                p86 p86Var = s86Var2.f29987i;
                s86 s86Var3 = (s86) p86Var.f27462e;
                s86Var3.mo5038t();
                s86Var3.mo5038t();
                long j = ((s86) p86Var.f27462e).m10560y().getLong((String) p86Var.f27459b, 0L);
                if (j == 0) {
                    p86Var.m9438b();
                    jAbs = 0;
                } else {
                    ((oa6) s86Var3.f36084a).f26519k.getClass();
                    jAbs = Math.abs(j - System.currentTimeMillis());
                }
                long j2 = p86Var.f27458a;
                if (jAbs < j2) {
                    pair = null;
                } else if (jAbs > j2 + j2) {
                    p86Var.m9438b();
                    pair = null;
                } else {
                    String string = s86Var3.m10560y().getString((String) p86Var.f27461d, null);
                    long j3 = s86Var3.m10560y().getLong((String) p86Var.f27460c, 0L);
                    p86Var.m9438b();
                    pair = (string == null || j3 <= 0) ? s86.f29972X : new Pair(string, Long.valueOf(j3));
                }
                if (pair != null && pair != s86.f29972X) {
                    String strValueOf = String.valueOf(pair.second);
                    String str = (String) pair.first;
                    strM3881m = c75.m3881m(new StringBuilder(strValueOf.length() + 1 + String.valueOf(str).length()), strValueOf, ":", str);
                }
            }
        }
        return e66VarM9029p.m4938y(strM3881m);
    }

    /* JADX INFO: renamed from: M */
    public final boolean m9143M() {
        mo5038t();
        m9741u();
        return this.f26789h != null;
    }

    /* JADX INFO: renamed from: N */
    public final void m9144N() {
        mo5038t();
        m9741u();
        if (m9135E()) {
            cp6 cp6VarM9142L = m9142L(false);
            hi6 hi6Var = new hi6((byte) 1);
            hi6Var.f20613b = cp6VarM9142L;
            hi6Var.f20614c = this;
            VarHandle.storeStoreFence();
            m9140J(hi6Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:240:0x0447 A[Catch: all -> 0x0483, TRY_ENTER, TryCatch #52 {all -> 0x0483, blocks: (B:250:0x0473, B:240:0x0447, B:242:0x044d, B:243:0x0450, B:260:0x0494, B:203:0x03b3, B:205:0x03bd, B:210:0x03d0), top: B:368:0x0473 }] */
    /* JADX WARN: Code duplicated, block: B:245:0x045f  */
    /* JADX WARN: Code duplicated, block: B:253:0x047a  */
    /* JADX WARN: Code duplicated, block: B:255:0x047f A[PHI: r5 r14 r24 r26 r27 r36 r37
  0x047f: PHI (r5v5 int) = (r5v3 int), (r5v3 int), (r5v6 int) binds: [B:246:0x0462, B:263:0x04a6, B:254:0x047d] A[DONT_GENERATE, DONT_INLINE]
  0x047f: PHI (r14v12 android.database.sqlite.SQLiteDatabase) = 
  (r14v9 android.database.sqlite.SQLiteDatabase)
  (r14v10 android.database.sqlite.SQLiteDatabase)
  (r14v13 android.database.sqlite.SQLiteDatabase)
 binds: [B:246:0x0462, B:263:0x04a6, B:254:0x047d] A[DONT_GENERATE, DONT_INLINE]
  0x047f: PHI (r24v9 java.lang.String) = (r24v6 java.lang.String), (r24v7 java.lang.String), (r24v10 java.lang.String) binds: [B:246:0x0462, B:263:0x04a6, B:254:0x047d] A[DONT_GENERATE, DONT_INLINE]
  0x047f: PHI (r26v9 java.lang.String) = (r26v6 java.lang.String), (r26v7 java.lang.String), (r26v10 java.lang.String) binds: [B:246:0x0462, B:263:0x04a6, B:254:0x047d] A[DONT_GENERATE, DONT_INLINE]
  0x047f: PHI (r27v11 op5) = (r27v8 op5), (r27v9 op5), (r27v12 op5) binds: [B:246:0x0462, B:263:0x04a6, B:254:0x047d] A[DONT_GENERATE, DONT_INLINE]
  0x047f: PHI (r36v9 int) = (r36v6 int), (r36v7 int), (r36v10 int) binds: [B:246:0x0462, B:263:0x04a6, B:254:0x047d] A[DONT_GENERATE, DONT_INLINE]
  0x047f: PHI (r37v9 java.lang.String) = (r37v6 java.lang.String), (r37v7 java.lang.String), (r37v10 java.lang.String) binds: [B:246:0x0462, B:263:0x04a6, B:254:0x047d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:262:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:267:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:269:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:274:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:275:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:282:0x0509  */
    /* JADX WARN: Code duplicated, block: B:284:0x0519  */
    /* JADX WARN: Code duplicated, block: B:286:0x0521  */
    /* JADX WARN: Code duplicated, block: B:287:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:290:0x05ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:299:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:302:0x05da A[Catch: RemoteException -> 0x0608, TRY_LEAVE, TryCatch #60 {RemoteException -> 0x0608, blocks: (B:300:0x05d3, B:302:0x05da), top: B:378:0x05d3 }] */
    /* JADX WARN: Code duplicated, block: B:310:0x060c  */
    /* JADX WARN: Code duplicated, block: B:317:0x063d  */
    /* JADX WARN: Code duplicated, block: B:323:0x0655  */
    /* JADX WARN: Code duplicated, block: B:329:0x066b  */
    /* JADX WARN: Code duplicated, block: B:337:0x0690  */
    /* JADX WARN: Code duplicated, block: B:356:0x0643 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:358:0x05b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:364:0x0659 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:423:0x04a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:424:0x04a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:426:0x04a9 A[SYNTHETIC] */
    /* JADX INFO: renamed from: O */
    public final void m9145O(s56 s56Var, AbstractC0894m2 abstractC0894m2, cp6 cp6Var) throws Throwable {
        ArrayList arrayList;
        int i;
        oa6 oa6Var;
        d76 d76Var;
        int i2;
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        int i3;
        Cursor cursorQuery;
        Cursor cursorQuery2;
        long j;
        String str;
        String[] strArr;
        long j2;
        String string;
        d56 d56Var;
        os5 os5VarCreateFromParcel;
        int i4;
        yo5 yo5VarCreateFromParcel;
        xm6 xm6VarCreateFromParcel;
        int size;
        op5 op5Var;
        String str2;
        boolean zM9225E;
        int size2;
        cp6 cp6Var2;
        int i5;
        j66 j66Var;
        AbstractC0894m2 abstractC0894m3;
        d56 d56Var2;
        cp6 cp6Var3;
        d76 d76Var2;
        oa6 oa6Var2;
        String str3;
        long jElapsedRealtime;
        long j3;
        long jCurrentTimeMillis;
        long j4;
        String str4;
        mo5038t();
        m9741u();
        m9138H();
        oa6 oa6Var3 = (oa6) this.f36084a;
        op5 op5Var2 = oa6Var3.f26512d;
        d76 d76Var3 = oa6Var3.f26514f;
        ia5 ia5Var = oa6Var3.f26519k;
        cp6 cp6Var4 = cp6Var;
        int i6 = 100;
        int i7 = 0;
        for (int i8 = 100; i7 < 1001 && i6 == i8; i8 = 100) {
            ArrayList arrayList2 = new ArrayList();
            m66 m66VarM9026m = oa6Var3.m9026m();
            String str5 = "entry";
            String str6 = "type";
            int i9 = i8;
            String str7 = "rowid";
            oa6 oa6Var4 = (oa6) m66VarM9026m.f36084a;
            m66VarM9026m.mo5038t();
            ia5 ia5Var2 = ia5Var;
            if (m66VarM9026m.f24696h) {
                oa6Var = oa6Var3;
                op5Var2 = op5Var2;
                d76Var = d76Var3;
                i = i7;
            } else {
                arrayList = new ArrayList();
                i = i7;
                if (((oa6) m66VarM9026m.f36084a).f26509a.getDatabasePath("google_app_measurement_local.db").exists()) {
                    int i10 = 5;
                    oa6Var = oa6Var3;
                    d76Var = d76Var3;
                    int i11 = 5;
                    int i12 = 0;
                    while (true) {
                        if (i12 < i10) {
                            try {
                                SQLiteDatabase sQLiteDatabaseM8201A = m66VarM9026m.m8201A();
                                if (sQLiteDatabaseM8201A == null) {
                                    try {
                                        try {
                                            m66VarM9026m.f24696h = true;
                                            op5Var2 = op5Var2;
                                        } catch (SQLiteDatabaseLockedException unused) {
                                            sQLiteDatabase = sQLiteDatabaseM8201A;
                                            i3 = i12;
                                            str7 = str7;
                                            str6 = str6;
                                            cursorQuery = null;
                                            try {
                                                SystemClock.sleep(i11);
                                                i11 += 20;
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                if (sQLiteDatabase != null) {
                                                    sQLiteDatabase.close();
                                                }
                                                i12 = i3 + 1;
                                                str5 = str5;
                                                str6 = str6;
                                                op5Var2 = op5Var2;
                                                str7 = str7;
                                                i10 = 5;
                                            } catch (Throwable th) {
                                                th = th;
                                                cursor = cursorQuery;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                if (sQLiteDatabase != null) {
                                                    sQLiteDatabase.close();
                                                }
                                                throw th;
                                            }
                                        } catch (SQLiteFullException e) {
                                            e = e;
                                            sQLiteDatabase = sQLiteDatabaseM8201A;
                                            i3 = i12;
                                            str7 = str7;
                                            str6 = str6;
                                            cursorQuery = null;
                                            d76 d76Var4 = oa6Var4.f26514f;
                                            oa6.m9016l(d76Var4);
                                            d76Var4.f16835j.m12505b(e, "Error reading entries from local database");
                                            m66VarM9026m.f24696h = true;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            if (sQLiteDatabase != null) {
                                                sQLiteDatabase.close();
                                            }
                                            i12 = i3 + 1;
                                            str5 = str5;
                                            str6 = str6;
                                            op5Var2 = op5Var2;
                                            str7 = str7;
                                            i10 = 5;
                                        } catch (SQLiteException e2) {
                                            e = e2;
                                            sQLiteDatabase = sQLiteDatabaseM8201A;
                                            i3 = i12;
                                            str7 = str7;
                                            str6 = str6;
                                            cursorQuery = null;
                                            if (sQLiteDatabase != null) {
                                                sQLiteDatabase.endTransaction();
                                            }
                                            d76 d76Var5 = oa6Var4.f26514f;
                                            oa6.m9016l(d76Var5);
                                            d76Var5.f16835j.m12505b(e, "Error reading entries from local database");
                                            m66VarM9026m.f24696h = true;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            if (sQLiteDatabase != null) {
                                                sQLiteDatabase.close();
                                            }
                                            i12 = i3 + 1;
                                            str5 = str5;
                                            str6 = str6;
                                            op5Var2 = op5Var2;
                                            str7 = str7;
                                            i10 = 5;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        sQLiteDatabase = sQLiteDatabaseM8201A;
                                        cursor = null;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        throw th;
                                    }
                                } else {
                                    sQLiteDatabaseM8201A.beginTransaction();
                                    try {
                                        cursorQuery2 = sQLiteDatabaseM8201A.query("messages", new String[]{str7}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                                        try {
                                            long j5 = -1;
                                            if (cursorQuery2.moveToFirst()) {
                                                i3 = i12;
                                                try {
                                                    j = cursorQuery2.getLong(0);
                                                    try {
                                                        cursorQuery2.close();
                                                    } catch (SQLiteDatabaseLockedException unused2) {
                                                        sQLiteDatabase = sQLiteDatabaseM8201A;
                                                        str7 = str7;
                                                        str6 = str6;
                                                        cursorQuery = null;
                                                        SystemClock.sleep(i11);
                                                        i11 += 20;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabase != null) {
                                                            sQLiteDatabase.close();
                                                        }
                                                        i12 = i3 + 1;
                                                        str5 = str5;
                                                        str6 = str6;
                                                        op5Var2 = op5Var2;
                                                        str7 = str7;
                                                        i10 = 5;
                                                    } catch (SQLiteFullException e3) {
                                                        e = e3;
                                                        sQLiteDatabase = sQLiteDatabaseM8201A;
                                                        str7 = str7;
                                                        str6 = str6;
                                                        cursorQuery = null;
                                                        d76 d76Var6 = oa6Var4.f26514f;
                                                        oa6.m9016l(d76Var6);
                                                        d76Var6.f16835j.m12505b(e, "Error reading entries from local database");
                                                        m66VarM9026m.f24696h = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabase != null) {
                                                            sQLiteDatabase.close();
                                                        }
                                                        i12 = i3 + 1;
                                                        str5 = str5;
                                                        str6 = str6;
                                                        op5Var2 = op5Var2;
                                                        str7 = str7;
                                                        i10 = 5;
                                                    } catch (SQLiteException e4) {
                                                        e = e4;
                                                        sQLiteDatabase = sQLiteDatabaseM8201A;
                                                        str7 = str7;
                                                        str6 = str6;
                                                        cursorQuery = null;
                                                        if (sQLiteDatabase != null) {
                                                            sQLiteDatabase.endTransaction();
                                                        }
                                                        d76 d76Var7 = oa6Var4.f26514f;
                                                        oa6.m9016l(d76Var7);
                                                        d76Var7.f16835j.m12505b(e, "Error reading entries from local database");
                                                        m66VarM9026m.f24696h = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabase != null) {
                                                            sQLiteDatabase.close();
                                                        }
                                                        i12 = i3 + 1;
                                                        str5 = str5;
                                                        str6 = str6;
                                                        op5Var2 = op5Var2;
                                                        str7 = str7;
                                                        i10 = 5;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    sQLiteDatabase = sQLiteDatabaseM8201A;
                                                    if (cursorQuery2 != null) {
                                                        try {
                                                            cursorQuery2.close();
                                                        } catch (SQLiteDatabaseLockedException unused3) {
                                                            cursorQuery = null;
                                                            SystemClock.sleep(i11);
                                                            i11 += 20;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabase != null) {
                                                                sQLiteDatabase.close();
                                                            }
                                                            i12 = i3 + 1;
                                                            str5 = str5;
                                                            str6 = str6;
                                                            op5Var2 = op5Var2;
                                                            str7 = str7;
                                                            i10 = 5;
                                                        } catch (SQLiteFullException e5) {
                                                            e = e5;
                                                            cursorQuery = null;
                                                            d76 d76Var8 = oa6Var4.f26514f;
                                                            oa6.m9016l(d76Var8);
                                                            d76Var8.f16835j.m12505b(e, "Error reading entries from local database");
                                                            m66VarM9026m.f24696h = true;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabase != null) {
                                                                sQLiteDatabase.close();
                                                            }
                                                            i12 = i3 + 1;
                                                            str5 = str5;
                                                            str6 = str6;
                                                            op5Var2 = op5Var2;
                                                            str7 = str7;
                                                            i10 = 5;
                                                        } catch (SQLiteException e6) {
                                                            e = e6;
                                                            cursorQuery = null;
                                                            if (sQLiteDatabase != null) {
                                                                sQLiteDatabase.endTransaction();
                                                            }
                                                            d76 d76Var9 = oa6Var4.f26514f;
                                                            oa6.m9016l(d76Var9);
                                                            d76Var9.f16835j.m12505b(e, "Error reading entries from local database");
                                                            m66VarM9026m.f24696h = true;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabase != null) {
                                                                sQLiteDatabase.close();
                                                            }
                                                            i12 = i3 + 1;
                                                            str5 = str5;
                                                            str6 = str6;
                                                            op5Var2 = op5Var2;
                                                            str7 = str7;
                                                            i10 = 5;
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            cursor = null;
                                                            if (cursor != null) {
                                                                cursor.close();
                                                            }
                                                            if (sQLiteDatabase != null) {
                                                                sQLiteDatabase.close();
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    throw th;
                                                }
                                            } else {
                                                i3 = i12;
                                                cursorQuery2.close();
                                                j = -1;
                                            }
                                            if (j != -1) {
                                                str = "rowid<?";
                                                strArr = new String[]{String.valueOf(j)};
                                            } else {
                                                str = null;
                                                strArr = null;
                                            }
                                            String[] strArr2 = {str7, str6, str5};
                                            op5 op5Var3 = oa6Var4.f26512d;
                                            d56 d56Var3 = e56.f17777c1;
                                            str7 = str7;
                                            try {
                                                int i13 = 4;
                                                int i14 = 3;
                                                if (op5Var3.m9225E(null, d56Var3)) {
                                                    strArr2 = new String[]{str7, str6, str5, "app_version", "app_version_int"};
                                                }
                                                cursorQuery = sQLiteDatabaseM8201A.query("messages", strArr2, str, strArr, null, null, "rowid asc", Integer.toString(i9));
                                                while (cursorQuery.moveToNext()) {
                                                    try {
                                                        try {
                                                            try {
                                                                j5 = cursorQuery.getLong(0);
                                                                try {
                                                                    int i15 = cursorQuery.getInt(1);
                                                                    str5 = str5;
                                                                    try {
                                                                        byte[] blob = cursorQuery.getBlob(2);
                                                                        str6 = str6;
                                                                        try {
                                                                            if (oa6Var4.f26512d.m9225E(null, d56Var3)) {
                                                                                try {
                                                                                    string = cursorQuery.getString(i14);
                                                                                    j2 = cursorQuery.getLong(i13);
                                                                                } catch (SQLiteDatabaseLockedException unused4) {
                                                                                    cursorQuery = cursorQuery;
                                                                                    op5Var2 = op5Var2;
                                                                                    sQLiteDatabase = sQLiteDatabaseM8201A;
                                                                                    SystemClock.sleep(i11);
                                                                                    i11 += 20;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabase != null) {
                                                                                        sQLiteDatabase.close();
                                                                                    }
                                                                                    i12 = i3 + 1;
                                                                                    str5 = str5;
                                                                                    str6 = str6;
                                                                                    op5Var2 = op5Var2;
                                                                                    str7 = str7;
                                                                                    i10 = 5;
                                                                                } catch (SQLiteFullException e7) {
                                                                                    e = e7;
                                                                                    cursorQuery = cursorQuery;
                                                                                    op5Var2 = op5Var2;
                                                                                    sQLiteDatabase = sQLiteDatabaseM8201A;
                                                                                    d76 d76Var10 = oa6Var4.f26514f;
                                                                                    oa6.m9016l(d76Var10);
                                                                                    d76Var10.f16835j.m12505b(e, "Error reading entries from local database");
                                                                                    m66VarM9026m.f24696h = true;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabase != null) {
                                                                                        sQLiteDatabase.close();
                                                                                    }
                                                                                    i12 = i3 + 1;
                                                                                    str5 = str5;
                                                                                    str6 = str6;
                                                                                    op5Var2 = op5Var2;
                                                                                    str7 = str7;
                                                                                    i10 = 5;
                                                                                } catch (SQLiteException e8) {
                                                                                    e = e8;
                                                                                    cursorQuery = cursorQuery;
                                                                                    op5Var2 = op5Var2;
                                                                                    sQLiteDatabase = sQLiteDatabaseM8201A;
                                                                                    if (sQLiteDatabase != null) {
                                                                                        sQLiteDatabase.endTransaction();
                                                                                    }
                                                                                    d76 d76Var11 = oa6Var4.f26514f;
                                                                                    oa6.m9016l(d76Var11);
                                                                                    d76Var11.f16835j.m12505b(e, "Error reading entries from local database");
                                                                                    m66VarM9026m.f24696h = true;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabase != null) {
                                                                                        sQLiteDatabase.close();
                                                                                    }
                                                                                    i12 = i3 + 1;
                                                                                    str5 = str5;
                                                                                    str6 = str6;
                                                                                    op5Var2 = op5Var2;
                                                                                    str7 = str7;
                                                                                    i10 = 5;
                                                                                }
                                                                            } else {
                                                                                j2 = 0;
                                                                                string = null;
                                                                            }
                                                                            if (i15 == 0) {
                                                                                cursorQuery = cursorQuery;
                                                                                try {
                                                                                    try {
                                                                                        Parcel parcelObtain = Parcel.obtain();
                                                                                        try {
                                                                                            try {
                                                                                                d56Var = d56Var3;
                                                                                                try {
                                                                                                    parcelObtain.unmarshall(blob, 0, blob.length);
                                                                                                    parcelObtain.setDataPosition(0);
                                                                                                    ys5 ys5VarCreateFromParcel = ys5.CREATOR.createFromParcel(parcelObtain);
                                                                                                    parcelObtain.recycle();
                                                                                                    if (ys5VarCreateFromParcel != null) {
                                                                                                        arrayList.add(new j66(ys5VarCreateFromParcel, string, j2));
                                                                                                    }
                                                                                                } catch (cu3 unused5) {
                                                                                                    d76 d76Var12 = oa6Var4.f26514f;
                                                                                                    oa6.m9016l(d76Var12);
                                                                                                    d76Var12.f16835j.m12504a("Failed to load event from local database");
                                                                                                    parcelObtain.recycle();
                                                                                                }
                                                                                            } catch (cu3 unused6) {
                                                                                                d56Var = d56Var3;
                                                                                            }
                                                                                        } catch (Throwable th5) {
                                                                                            parcelObtain.recycle();
                                                                                            throw th5;
                                                                                        }
                                                                                    } catch (SQLiteDatabaseLockedException unused7) {
                                                                                        sQLiteDatabase = sQLiteDatabaseM8201A;
                                                                                        SystemClock.sleep(i11);
                                                                                        i11 += 20;
                                                                                        if (cursorQuery != null) {
                                                                                            cursorQuery.close();
                                                                                        }
                                                                                        if (sQLiteDatabase != null) {
                                                                                            sQLiteDatabase.close();
                                                                                        }
                                                                                        i12 = i3 + 1;
                                                                                        str5 = str5;
                                                                                        str6 = str6;
                                                                                        op5Var2 = op5Var2;
                                                                                        str7 = str7;
                                                                                        i10 = 5;
                                                                                    } catch (SQLiteFullException e9) {
                                                                                        e = e9;
                                                                                        sQLiteDatabase = sQLiteDatabaseM8201A;
                                                                                        d76 d76Var13 = oa6Var4.f26514f;
                                                                                        oa6.m9016l(d76Var13);
                                                                                        d76Var13.f16835j.m12505b(e, "Error reading entries from local database");
                                                                                        m66VarM9026m.f24696h = true;
                                                                                        if (cursorQuery != null) {
                                                                                            cursorQuery.close();
                                                                                        }
                                                                                        if (sQLiteDatabase != null) {
                                                                                            sQLiteDatabase.close();
                                                                                        }
                                                                                        i12 = i3 + 1;
                                                                                        str5 = str5;
                                                                                        str6 = str6;
                                                                                        op5Var2 = op5Var2;
                                                                                        str7 = str7;
                                                                                        i10 = 5;
                                                                                    } catch (SQLiteException e10) {
                                                                                        e = e10;
                                                                                        sQLiteDatabase = sQLiteDatabaseM8201A;
                                                                                        if (sQLiteDatabase != null) {
                                                                                            sQLiteDatabase.endTransaction();
                                                                                        }
                                                                                        d76 d76Var14 = oa6Var4.f26514f;
                                                                                        oa6.m9016l(d76Var14);
                                                                                        d76Var14.f16835j.m12505b(e, "Error reading entries from local database");
                                                                                        m66VarM9026m.f24696h = true;
                                                                                        if (cursorQuery != null) {
                                                                                            cursorQuery.close();
                                                                                        }
                                                                                        if (sQLiteDatabase != null) {
                                                                                            sQLiteDatabase.close();
                                                                                        }
                                                                                        i12 = i3 + 1;
                                                                                        str5 = str5;
                                                                                        str6 = str6;
                                                                                        op5Var2 = op5Var2;
                                                                                        str7 = str7;
                                                                                        i10 = 5;
                                                                                    }
                                                                                } catch (Throwable th6) {
                                                                                    th = th6;
                                                                                    sQLiteDatabase = sQLiteDatabaseM8201A;
                                                                                    cursor = cursorQuery;
                                                                                    if (cursor != null) {
                                                                                        cursor.close();
                                                                                    }
                                                                                    if (sQLiteDatabase != null) {
                                                                                        sQLiteDatabase.close();
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                            } else {
                                                                                cursorQuery = cursorQuery;
                                                                                d56Var = d56Var3;
                                                                                if (i15 == 1) {
                                                                                    Parcel parcelObtain2 = Parcel.obtain();
                                                                                    try {
                                                                                        try {
                                                                                            parcelObtain2.unmarshall(blob, 0, blob.length);
                                                                                            parcelObtain2.setDataPosition(0);
                                                                                            xm6VarCreateFromParcel = xm6.CREATOR.createFromParcel(parcelObtain2);
                                                                                            parcelObtain2.recycle();
                                                                                        } catch (cu3 unused8) {
                                                                                            d76 d76Var15 = oa6Var4.f26514f;
                                                                                            oa6.m9016l(d76Var15);
                                                                                            d76Var15.f16835j.m12504a("Failed to load user property from local database");
                                                                                            parcelObtain2.recycle();
                                                                                            xm6VarCreateFromParcel = null;
                                                                                        }
                                                                                        if (xm6VarCreateFromParcel != null) {
                                                                                            arrayList.add(new j66(xm6VarCreateFromParcel, string, j2));
                                                                                        }
                                                                                    } catch (Throwable th7) {
                                                                                        parcelObtain2.recycle();
                                                                                        throw th7;
                                                                                    }
                                                                                } else {
                                                                                    if (i15 == 2) {
                                                                                        Parcel parcelObtain3 = Parcel.obtain();
                                                                                        try {
                                                                                            try {
                                                                                                parcelObtain3.unmarshall(blob, 0, blob.length);
                                                                                                parcelObtain3.setDataPosition(0);
                                                                                                yo5VarCreateFromParcel = yo5.CREATOR.createFromParcel(parcelObtain3);
                                                                                                parcelObtain3.recycle();
                                                                                            } catch (Throwable th8) {
                                                                                                parcelObtain3.recycle();
                                                                                                throw th8;
                                                                                            }
                                                                                        } catch (cu3 unused9) {
                                                                                            d76 d76Var16 = oa6Var4.f26514f;
                                                                                            oa6.m9016l(d76Var16);
                                                                                            d76Var16.f16835j.m12504a("Failed to load conditional user property from local database");
                                                                                            parcelObtain3.recycle();
                                                                                            yo5VarCreateFromParcel = null;
                                                                                        }
                                                                                        if (yo5VarCreateFromParcel != null) {
                                                                                            arrayList.add(new j66(yo5VarCreateFromParcel, string, j2));
                                                                                        }
                                                                                    } else if (i15 == 4) {
                                                                                        try {
                                                                                            Parcel parcelObtain4 = Parcel.obtain();
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        parcelObtain4.unmarshall(blob, 0, blob.length);
                                                                                                        parcelObtain4.setDataPosition(0);
                                                                                                        os5VarCreateFromParcel = os5.CREATOR.createFromParcel(parcelObtain4);
                                                                                                        try {
                                                                                                            parcelObtain4.recycle();
                                                                                                        } catch (SQLiteDatabaseLockedException unused10) {
                                                                                                            sQLiteDatabase = sQLiteDatabaseM8201A;
                                                                                                            SystemClock.sleep(i11);
                                                                                                            i11 += 20;
                                                                                                            if (cursorQuery != null) {
                                                                                                                cursorQuery.close();
                                                                                                            }
                                                                                                            if (sQLiteDatabase != null) {
                                                                                                                sQLiteDatabase.close();
                                                                                                            }
                                                                                                            i12 = i3 + 1;
                                                                                                            str5 = str5;
                                                                                                            str6 = str6;
                                                                                                            op5Var2 = op5Var2;
                                                                                                            str7 = str7;
                                                                                                            i10 = 5;
                                                                                                        } catch (SQLiteFullException e11) {
                                                                                                            e = e11;
                                                                                                            sQLiteDatabase = sQLiteDatabaseM8201A;
                                                                                                            d76 d76Var17 = oa6Var4.f26514f;
                                                                                                            oa6.m9016l(d76Var17);
                                                                                                            d76Var17.f16835j.m12505b(e, "Error reading entries from local database");
                                                                                                            m66VarM9026m.f24696h = true;
                                                                                                            if (cursorQuery != null) {
                                                                                                                cursorQuery.close();
                                                                                                            }
                                                                                                            if (sQLiteDatabase != null) {
                                                                                                                sQLiteDatabase.close();
                                                                                                            }
                                                                                                            i12 = i3 + 1;
                                                                                                            str5 = str5;
                                                                                                            str6 = str6;
                                                                                                            op5Var2 = op5Var2;
                                                                                                            str7 = str7;
                                                                                                            i10 = 5;
                                                                                                        } catch (SQLiteException e12) {
                                                                                                            e = e12;
                                                                                                            sQLiteDatabase = sQLiteDatabaseM8201A;
                                                                                                            if (sQLiteDatabase != null) {
                                                                                                                sQLiteDatabase.endTransaction();
                                                                                                            }
                                                                                                            d76 d76Var18 = oa6Var4.f26514f;
                                                                                                            oa6.m9016l(d76Var18);
                                                                                                            d76Var18.f16835j.m12505b(e, "Error reading entries from local database");
                                                                                                            m66VarM9026m.f24696h = true;
                                                                                                            if (cursorQuery != null) {
                                                                                                                cursorQuery.close();
                                                                                                            }
                                                                                                            if (sQLiteDatabase != null) {
                                                                                                                sQLiteDatabase.close();
                                                                                                            }
                                                                                                            i12 = i3 + 1;
                                                                                                            str5 = str5;
                                                                                                            str6 = str6;
                                                                                                            op5Var2 = op5Var2;
                                                                                                            str7 = str7;
                                                                                                            i10 = 5;
                                                                                                        }
                                                                                                    } catch (Throwable th9) {
                                                                                                        th = th9;
                                                                                                        parcelObtain4.recycle();
                                                                                                        throw th;
                                                                                                    }
                                                                                                } catch (cu3 unused11) {
                                                                                                    d76 d76Var19 = oa6Var4.f26514f;
                                                                                                    oa6.m9016l(d76Var19);
                                                                                                    d76Var19.f16835j.m12504a("Failed to load default event parameters from local database");
                                                                                                    parcelObtain4.recycle();
                                                                                                    os5VarCreateFromParcel = null;
                                                                                                }
                                                                                            } catch (cu3 unused12) {
                                                                                            } catch (Throwable th10) {
                                                                                                th = th10;
                                                                                            }
                                                                                            if (os5VarCreateFromParcel != null) {
                                                                                                arrayList.add(new j66(os5VarCreateFromParcel, string, j2));
                                                                                            }
                                                                                            i4 = 3;
                                                                                        } catch (SQLiteDatabaseLockedException unused13) {
                                                                                            sQLiteDatabase = sQLiteDatabaseM8201A;
                                                                                            SystemClock.sleep(i11);
                                                                                            i11 += 20;
                                                                                            if (cursorQuery != null) {
                                                                                                cursorQuery.close();
                                                                                            }
                                                                                            if (sQLiteDatabase != null) {
                                                                                                sQLiteDatabase.close();
                                                                                            }
                                                                                            i12 = i3 + 1;
                                                                                            str5 = str5;
                                                                                            str6 = str6;
                                                                                            op5Var2 = op5Var2;
                                                                                            str7 = str7;
                                                                                            i10 = 5;
                                                                                        } catch (SQLiteFullException e13) {
                                                                                            e = e13;
                                                                                            sQLiteDatabase = sQLiteDatabaseM8201A;
                                                                                            d76 d76Var110 = oa6Var4.f26514f;
                                                                                            oa6.m9016l(d76Var110);
                                                                                            d76Var110.f16835j.m12505b(e, "Error reading entries from local database");
                                                                                            m66VarM9026m.f24696h = true;
                                                                                            if (cursorQuery != null) {
                                                                                                cursorQuery.close();
                                                                                            }
                                                                                            if (sQLiteDatabase != null) {
                                                                                                sQLiteDatabase.close();
                                                                                            }
                                                                                            i12 = i3 + 1;
                                                                                            str5 = str5;
                                                                                            str6 = str6;
                                                                                            op5Var2 = op5Var2;
                                                                                            str7 = str7;
                                                                                            i10 = 5;
                                                                                        } catch (SQLiteException e14) {
                                                                                            e = e14;
                                                                                            sQLiteDatabase = sQLiteDatabaseM8201A;
                                                                                            if (sQLiteDatabase != null) {
                                                                                                sQLiteDatabase.endTransaction();
                                                                                            }
                                                                                            d76 d76Var111 = oa6Var4.f26514f;
                                                                                            oa6.m9016l(d76Var111);
                                                                                            d76Var111.f16835j.m12505b(e, "Error reading entries from local database");
                                                                                            m66VarM9026m.f24696h = true;
                                                                                            if (cursorQuery != null) {
                                                                                                cursorQuery.close();
                                                                                            }
                                                                                            if (sQLiteDatabase != null) {
                                                                                                sQLiteDatabase.close();
                                                                                            }
                                                                                            i12 = i3 + 1;
                                                                                            str5 = str5;
                                                                                            str6 = str6;
                                                                                            op5Var2 = op5Var2;
                                                                                            str7 = str7;
                                                                                            i10 = 5;
                                                                                        }
                                                                                    } else {
                                                                                        d76 d76Var20 = oa6Var4.f26514f;
                                                                                        i4 = 3;
                                                                                        if (i15 == 3) {
                                                                                            oa6.m9016l(d76Var20);
                                                                                            d76Var20.f16831L.m12504a("Skipping app launch break");
                                                                                        } else {
                                                                                            oa6.m9016l(d76Var20);
                                                                                            d76Var20.f16835j.m12504a("Unknown record type in local database");
                                                                                        }
                                                                                    }
                                                                                    i14 = i4;
                                                                                    str5 = str5;
                                                                                    str6 = str6;
                                                                                    op5Var2 = op5Var2;
                                                                                    cursorQuery = cursorQuery;
                                                                                    d56Var3 = d56Var;
                                                                                    i13 = 4;
                                                                                }
                                                                            }
                                                                            i4 = 3;
                                                                            i14 = i4;
                                                                            str5 = str5;
                                                                            str6 = str6;
                                                                            op5Var2 = op5Var2;
                                                                            cursorQuery = cursorQuery;
                                                                            d56Var3 = d56Var;
                                                                            i13 = 4;
                                                                        } catch (SQLiteDatabaseLockedException unused14) {
                                                                            cursorQuery = cursorQuery;
                                                                            op5Var2 = op5Var2;
                                                                        } catch (SQLiteFullException e15) {
                                                                            e = e15;
                                                                            cursorQuery = cursorQuery;
                                                                            op5Var2 = op5Var2;
                                                                        } catch (SQLiteException e16) {
                                                                            e = e16;
                                                                            cursorQuery = cursorQuery;
                                                                            op5Var2 = op5Var2;
                                                                        }
                                                                    } catch (SQLiteDatabaseLockedException unused15) {
                                                                        str6 = str6;
                                                                        sQLiteDatabase = sQLiteDatabaseM8201A;
                                                                        SystemClock.sleep(i11);
                                                                        i11 += 20;
                                                                        if (cursorQuery != null) {
                                                                            cursorQuery.close();
                                                                        }
                                                                        if (sQLiteDatabase != null) {
                                                                            sQLiteDatabase.close();
                                                                        }
                                                                        i12 = i3 + 1;
                                                                        str5 = str5;
                                                                        str6 = str6;
                                                                        op5Var2 = op5Var2;
                                                                        str7 = str7;
                                                                        i10 = 5;
                                                                    } catch (SQLiteFullException e17) {
                                                                        e = e17;
                                                                        str6 = str6;
                                                                        sQLiteDatabase = sQLiteDatabaseM8201A;
                                                                        d76 d76Var112 = oa6Var4.f26514f;
                                                                        oa6.m9016l(d76Var112);
                                                                        d76Var112.f16835j.m12505b(e, "Error reading entries from local database");
                                                                        m66VarM9026m.f24696h = true;
                                                                        if (cursorQuery != null) {
                                                                            cursorQuery.close();
                                                                        }
                                                                        if (sQLiteDatabase != null) {
                                                                            sQLiteDatabase.close();
                                                                        }
                                                                        i12 = i3 + 1;
                                                                        str5 = str5;
                                                                        str6 = str6;
                                                                        op5Var2 = op5Var2;
                                                                        str7 = str7;
                                                                        i10 = 5;
                                                                    } catch (SQLiteException e18) {
                                                                        e = e18;
                                                                        str6 = str6;
                                                                        sQLiteDatabase = sQLiteDatabaseM8201A;
                                                                        if (sQLiteDatabase != null) {
                                                                            sQLiteDatabase.endTransaction();
                                                                        }
                                                                        d76 d76Var113 = oa6Var4.f26514f;
                                                                        oa6.m9016l(d76Var113);
                                                                        d76Var113.f16835j.m12505b(e, "Error reading entries from local database");
                                                                        m66VarM9026m.f24696h = true;
                                                                        if (cursorQuery != null) {
                                                                            cursorQuery.close();
                                                                        }
                                                                        if (sQLiteDatabase != null) {
                                                                            sQLiteDatabase.close();
                                                                        }
                                                                        i12 = i3 + 1;
                                                                        str5 = str5;
                                                                        str6 = str6;
                                                                        op5Var2 = op5Var2;
                                                                        str7 = str7;
                                                                        i10 = 5;
                                                                    }
                                                                } catch (SQLiteDatabaseLockedException unused16) {
                                                                    str5 = str5;
                                                                } catch (SQLiteFullException e19) {
                                                                    e = e19;
                                                                    str5 = str5;
                                                                } catch (SQLiteException e20) {
                                                                    e = e20;
                                                                    str5 = str5;
                                                                }
                                                            } catch (SQLiteDatabaseLockedException unused17) {
                                                                cursorQuery = cursorQuery;
                                                                op5Var2 = op5Var2;
                                                                str5 = str5;
                                                                str6 = str6;
                                                            } catch (SQLiteFullException e21) {
                                                                e = e21;
                                                                cursorQuery = cursorQuery;
                                                                op5Var2 = op5Var2;
                                                                str5 = str5;
                                                                str6 = str6;
                                                            } catch (SQLiteException e22) {
                                                                e = e22;
                                                                cursorQuery = cursorQuery;
                                                                op5Var2 = op5Var2;
                                                                str5 = str5;
                                                                str6 = str6;
                                                            }
                                                        } catch (SQLiteDatabaseLockedException unused18) {
                                                            cursorQuery = cursorQuery;
                                                            op5Var2 = op5Var2;
                                                            str5 = str5;
                                                            str6 = str6;
                                                        } catch (SQLiteFullException e23) {
                                                            e = e23;
                                                            cursorQuery = cursorQuery;
                                                            op5Var2 = op5Var2;
                                                            str5 = str5;
                                                            str6 = str6;
                                                        } catch (SQLiteException e24) {
                                                            e = e24;
                                                            cursorQuery = cursorQuery;
                                                            op5Var2 = op5Var2;
                                                            str5 = str5;
                                                            str6 = str6;
                                                        }
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                        cursorQuery = cursorQuery;
                                                    }
                                                }
                                                cursorQuery = cursorQuery;
                                                op5Var2 = op5Var2;
                                                str5 = str5;
                                                str6 = str6;
                                                i2 = 0;
                                                sQLiteDatabase = sQLiteDatabaseM8201A;
                                                try {
                                                    if (sQLiteDatabase.delete("messages", "rowid <= ?", new String[]{Long.toString(j5)}) < arrayList.size()) {
                                                        d76 d76Var21 = oa6Var4.f26514f;
                                                        oa6.m9016l(d76Var21);
                                                        d76Var21.f16835j.m12504a("Fewer entries removed from local database than expected");
                                                    }
                                                    sQLiteDatabase.setTransactionSuccessful();
                                                    sQLiteDatabase.endTransaction();
                                                    cursorQuery.close();
                                                    sQLiteDatabase.close();
                                                } catch (SQLiteDatabaseLockedException unused19) {
                                                    SystemClock.sleep(i11);
                                                    i11 += 20;
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    if (sQLiteDatabase != null) {
                                                        sQLiteDatabase.close();
                                                    }
                                                    i12 = i3 + 1;
                                                    str5 = str5;
                                                    str6 = str6;
                                                    op5Var2 = op5Var2;
                                                    str7 = str7;
                                                    i10 = 5;
                                                } catch (SQLiteFullException e25) {
                                                    e = e25;
                                                    d76 d76Var114 = oa6Var4.f26514f;
                                                    oa6.m9016l(d76Var114);
                                                    d76Var114.f16835j.m12505b(e, "Error reading entries from local database");
                                                    m66VarM9026m.f24696h = true;
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    if (sQLiteDatabase != null) {
                                                        sQLiteDatabase.close();
                                                    }
                                                    i12 = i3 + 1;
                                                    str5 = str5;
                                                    str6 = str6;
                                                    op5Var2 = op5Var2;
                                                    str7 = str7;
                                                    i10 = 5;
                                                } catch (SQLiteException e26) {
                                                    e = e26;
                                                    if (sQLiteDatabase != null) {
                                                        sQLiteDatabase.endTransaction();
                                                    }
                                                    d76 d76Var115 = oa6Var4.f26514f;
                                                    oa6.m9016l(d76Var115);
                                                    d76Var115.f16835j.m12505b(e, "Error reading entries from local database");
                                                    m66VarM9026m.f24696h = true;
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    if (sQLiteDatabase != null) {
                                                        sQLiteDatabase.close();
                                                    }
                                                    i12 = i3 + 1;
                                                    str5 = str5;
                                                    str6 = str6;
                                                    op5Var2 = op5Var2;
                                                    str7 = str7;
                                                    i10 = 5;
                                                }
                                            } catch (SQLiteDatabaseLockedException unused20) {
                                                str5 = str5;
                                                sQLiteDatabase = sQLiteDatabaseM8201A;
                                                str6 = str6;
                                                cursorQuery = null;
                                                SystemClock.sleep(i11);
                                                i11 += 20;
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                if (sQLiteDatabase != null) {
                                                    sQLiteDatabase.close();
                                                }
                                                i12 = i3 + 1;
                                                str5 = str5;
                                                str6 = str6;
                                                op5Var2 = op5Var2;
                                                str7 = str7;
                                                i10 = 5;
                                            } catch (SQLiteFullException e27) {
                                                e = e27;
                                                str5 = str5;
                                                sQLiteDatabase = sQLiteDatabaseM8201A;
                                                str6 = str6;
                                                cursorQuery = null;
                                                d76 d76Var116 = oa6Var4.f26514f;
                                                oa6.m9016l(d76Var116);
                                                d76Var116.f16835j.m12505b(e, "Error reading entries from local database");
                                                m66VarM9026m.f24696h = true;
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                if (sQLiteDatabase != null) {
                                                    sQLiteDatabase.close();
                                                }
                                                i12 = i3 + 1;
                                                str5 = str5;
                                                str6 = str6;
                                                op5Var2 = op5Var2;
                                                str7 = str7;
                                                i10 = 5;
                                            } catch (SQLiteException e28) {
                                                e = e28;
                                                str5 = str5;
                                                sQLiteDatabase = sQLiteDatabaseM8201A;
                                                str6 = str6;
                                                cursorQuery = null;
                                                if (sQLiteDatabase != null && sQLiteDatabase.inTransaction()) {
                                                    sQLiteDatabase.endTransaction();
                                                }
                                                d76 d76Var117 = oa6Var4.f26514f;
                                                oa6.m9016l(d76Var117);
                                                d76Var117.f16835j.m12505b(e, "Error reading entries from local database");
                                                m66VarM9026m.f24696h = true;
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                if (sQLiteDatabase != null) {
                                                    sQLiteDatabase.close();
                                                }
                                                i12 = i3 + 1;
                                                str5 = str5;
                                                str6 = str6;
                                                op5Var2 = op5Var2;
                                                str7 = str7;
                                                i10 = 5;
                                            }
                                        } catch (Throwable th12) {
                                            th = th12;
                                            i3 = i12;
                                        }
                                    } catch (Throwable th13) {
                                        th = th13;
                                        sQLiteDatabase = sQLiteDatabaseM8201A;
                                        i3 = i12;
                                        cursorQuery2 = null;
                                    }
                                }
                            } catch (SQLiteDatabaseLockedException unused21) {
                                i3 = i12;
                                op5Var2 = op5Var2;
                                str7 = str7;
                                str5 = str5;
                                str6 = str6;
                                sQLiteDatabase = null;
                            } catch (SQLiteFullException e29) {
                                e = e29;
                                i3 = i12;
                                op5Var2 = op5Var2;
                                str7 = str7;
                                str5 = str5;
                                str6 = str6;
                                sQLiteDatabase = null;
                            } catch (SQLiteException e30) {
                                e = e30;
                                i3 = i12;
                                op5Var2 = op5Var2;
                                str7 = str7;
                                str5 = str5;
                                str6 = str6;
                                sQLiteDatabase = null;
                            } catch (Throwable th14) {
                                th = th14;
                                cursor = null;
                                sQLiteDatabase = null;
                            }
                        } else {
                            op5Var2 = op5Var2;
                            i2 = 0;
                            d76 d76Var22 = oa6Var4.f26514f;
                            oa6.m9016l(d76Var22);
                            d76Var22.f16838m.m12504a("Failed to read events from database in reasonable time");
                            arrayList = null;
                        }
                        i12 = i3 + 1;
                        str5 = str5;
                        str6 = str6;
                        op5Var2 = op5Var2;
                        str7 = str7;
                        i10 = 5;
                    }
                } else {
                    oa6Var = oa6Var3;
                    op5Var2 = op5Var2;
                    d76Var = d76Var3;
                    i2 = 0;
                }
                if (arrayList != null) {
                    arrayList2.addAll(arrayList);
                    size = arrayList.size();
                } else {
                    size = i2;
                }
                if (abstractC0894m2 != 0 && size < i9) {
                    arrayList2.add(new j66(abstractC0894m2, cp6Var4.f16351f, cp6Var4.f16358m));
                }
                op5Var = op5Var2;
                str2 = null;
                zM9225E = op5Var.m9225E(null, e56.f17746O0);
                size2 = arrayList2.size();
                cp6Var2 = cp6Var4;
                i5 = i2;
                while (i5 < size2) {
                    j66Var = (j66) arrayList2.get(i5);
                    abstractC0894m3 = j66Var.f22060a;
                    d56Var2 = e56.f17777c1;
                    if (op5Var.m9225E(str2, d56Var2)) {
                        str4 = j66Var.f22061b;
                        if (TextUtils.isEmpty(str4)) {
                            cp6Var3 = cp6Var2;
                        } else {
                            cp6Var3 = new cp6(cp6Var2.f16349d, cp6Var2.f16350e, str4, j66Var.f22062c, cp6Var2.f16352g, cp6Var2.f16353h, cp6Var2.f16354i, cp6Var2.f16355j, cp6Var2.f16356k, cp6Var2.f16357l, cp6Var2.f16359n, cp6Var2.f16360o, cp6Var2.f16361p, cp6Var2.f16362q, cp6Var2.f16363r, cp6Var2.f16364s, cp6Var2.f16365t, cp6Var2.f16366u, cp6Var2.f16367v, cp6Var2.f16368w, cp6Var2.f16369x, cp6Var2.f16370y, cp6Var2.f16371z, cp6Var2.f16341A, cp6Var2.f16342B, cp6Var2.f16343C, cp6Var2.f16344D, cp6Var2.f16345E, cp6Var2.f16346F, cp6Var2.f16347G, cp6Var2.f16348H);
                        }
                    } else {
                        cp6Var3 = cp6Var2;
                    }
                    if (abstractC0894m3 instanceof ys5) {
                        if (zM9225E) {
                            try {
                                ia5Var2.getClass();
                                jCurrentTimeMillis = System.currentTimeMillis();
                                try {
                                    ia5Var2.getClass();
                                    jElapsedRealtime = SystemClock.elapsedRealtime();
                                    j4 = jCurrentTimeMillis;
                                } catch (RemoteException e31) {
                                    e = e31;
                                    j3 = jCurrentTimeMillis;
                                    jElapsedRealtime = 0;
                                    d76Var2 = d76Var;
                                    oa6.m9016l(d76Var2);
                                    d76Var2.f16835j.m12505b(e, "Failed to send event to the service");
                                    if (zM9225E && j3 != 0) {
                                        tt2 tt2VarM11139E = tt2.m11139E(oa6Var);
                                        ia5Var2.getClass();
                                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                                        ia5Var2.getClass();
                                        tt2VarM11139E.m11147G(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j3, jCurrentTimeMillis2);
                                    }
                                    oa6Var2 = oa6Var;
                                    str3 = null;
                                    i5++;
                                    cp6Var2 = cp6Var3;
                                    d76Var = d76Var2;
                                    oa6Var = oa6Var2;
                                    op5Var = op5Var;
                                    size = size;
                                    str2 = str3;
                                }
                            } catch (RemoteException e32) {
                                e = e32;
                                jElapsedRealtime = 0;
                                j3 = 0;
                            }
                        } else {
                            jElapsedRealtime = 0;
                            j4 = 0;
                        }
                        try {
                            s56Var.mo5578u((ys5) abstractC0894m3, cp6Var3);
                            if (zM9225E) {
                                oa6.m9016l(d76Var);
                                d76Var2 = d76Var;
                                try {
                                    d76Var2.f16831L.m12504a("Logging telemetry for logEvent from database");
                                    tt2 tt2VarM11139E2 = tt2.m11139E(oa6Var);
                                    ia5Var2.getClass();
                                    long jCurrentTimeMillis3 = System.currentTimeMillis();
                                    ia5Var2.getClass();
                                    tt2VarM11139E2.m11147G(0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j4, jCurrentTimeMillis3);
                                } catch (RemoteException e33) {
                                    e = e33;
                                    j3 = j4;
                                    oa6.m9016l(d76Var2);
                                    d76Var2.f16835j.m12505b(e, "Failed to send event to the service");
                                    if (zM9225E) {
                                        tt2 tt2VarM11139E3 = tt2.m11139E(oa6Var);
                                        ia5Var2.getClass();
                                        long jCurrentTimeMillis4 = System.currentTimeMillis();
                                        ia5Var2.getClass();
                                        tt2VarM11139E3.m11147G(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j3, jCurrentTimeMillis4);
                                    }
                                }
                            } else {
                                d76Var2 = d76Var;
                            }
                        } catch (RemoteException e34) {
                            e = e34;
                            d76Var2 = d76Var;
                        }
                    } else {
                        d76Var2 = d76Var;
                        if (abstractC0894m3 instanceof xm6) {
                            try {
                                s56Var.mo5576q((xm6) abstractC0894m3, cp6Var3);
                            } catch (RemoteException e35) {
                                oa6.m9016l(d76Var2);
                                d76Var2.f16835j.m12505b(e35, "Failed to send user property to the service");
                            }
                        } else {
                            if (abstractC0894m3 instanceof yo5) {
                                try {
                                    s56Var.mo5562A((yo5) abstractC0894m3, cp6Var3);
                                } catch (RemoteException e36) {
                                    oa6.m9016l(d76Var2);
                                    d76Var2.f16835j.m12505b(e36, "Failed to send conditional user property to the service");
                                }
                            } else {
                                oa6Var2 = oa6Var;
                                str3 = null;
                                if (oa6Var2.f26512d.m9225E(null, d56Var2) || !(abstractC0894m3 instanceof os5)) {
                                    oa6.m9016l(d76Var2);
                                    d76Var2.f16835j.m12504a("Discarding data. Unrecognized parcel type.");
                                } else {
                                    try {
                                        s56Var.mo5568e(((os5) abstractC0894m3).m9261d(), cp6Var3);
                                    } catch (RemoteException e37) {
                                        oa6.m9016l(d76Var2);
                                        d76Var2.f16835j.m12505b(e37, "Failed to send default event parameters to the service");
                                    }
                                }
                            }
                            i5++;
                            cp6Var2 = cp6Var3;
                            d76Var = d76Var2;
                            oa6Var = oa6Var2;
                            op5Var = op5Var;
                            size = size;
                            str2 = str3;
                        }
                    }
                    oa6Var2 = oa6Var;
                    str3 = null;
                    i5++;
                    cp6Var2 = cp6Var3;
                    d76Var = d76Var2;
                    oa6Var = oa6Var2;
                    op5Var = op5Var;
                    size = size;
                    str2 = str3;
                }
                int i16 = size;
                op5 op5Var4 = op5Var;
                i7 = i + 1;
                cp6Var4 = cp6Var2;
                d76Var3 = d76Var;
                oa6Var3 = oa6Var;
                op5Var2 = op5Var4;
                ia5Var = ia5Var2;
                i6 = i16;
            }
            arrayList = null;
            i2 = 0;
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
                size = arrayList.size();
            } else {
                size = i2;
            }
            if (abstractC0894m2 != 0) {
                arrayList2.add(new j66(abstractC0894m2, cp6Var4.f16351f, cp6Var4.f16358m));
            }
            op5Var = op5Var2;
            str2 = null;
            zM9225E = op5Var.m9225E(null, e56.f17746O0);
            size2 = arrayList2.size();
            cp6Var2 = cp6Var4;
            i5 = i2;
            while (i5 < size2) {
                j66Var = (j66) arrayList2.get(i5);
                abstractC0894m3 = j66Var.f22060a;
                d56Var2 = e56.f17777c1;
                if (op5Var.m9225E(str2, d56Var2)) {
                    str4 = j66Var.f22061b;
                    if (TextUtils.isEmpty(str4)) {
                        cp6Var3 = new cp6(cp6Var2.f16349d, cp6Var2.f16350e, str4, j66Var.f22062c, cp6Var2.f16352g, cp6Var2.f16353h, cp6Var2.f16354i, cp6Var2.f16355j, cp6Var2.f16356k, cp6Var2.f16357l, cp6Var2.f16359n, cp6Var2.f16360o, cp6Var2.f16361p, cp6Var2.f16362q, cp6Var2.f16363r, cp6Var2.f16364s, cp6Var2.f16365t, cp6Var2.f16366u, cp6Var2.f16367v, cp6Var2.f16368w, cp6Var2.f16369x, cp6Var2.f16370y, cp6Var2.f16371z, cp6Var2.f16341A, cp6Var2.f16342B, cp6Var2.f16343C, cp6Var2.f16344D, cp6Var2.f16345E, cp6Var2.f16346F, cp6Var2.f16347G, cp6Var2.f16348H);
                    } else {
                        cp6Var3 = cp6Var2;
                    }
                } else {
                    cp6Var3 = cp6Var2;
                }
                if (abstractC0894m3 instanceof ys5) {
                    if (zM9225E) {
                        ia5Var2.getClass();
                        jCurrentTimeMillis = System.currentTimeMillis();
                        ia5Var2.getClass();
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                        j4 = jCurrentTimeMillis;
                    } else {
                        jElapsedRealtime = 0;
                        j4 = 0;
                    }
                    s56Var.mo5578u((ys5) abstractC0894m3, cp6Var3);
                    if (zM9225E) {
                        oa6.m9016l(d76Var);
                        d76Var2 = d76Var;
                        d76Var2.f16831L.m12504a("Logging telemetry for logEvent from database");
                        tt2 tt2VarM11139E4 = tt2.m11139E(oa6Var);
                        ia5Var2.getClass();
                        long jCurrentTimeMillis5 = System.currentTimeMillis();
                        ia5Var2.getClass();
                        tt2VarM11139E4.m11147G(0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j4, jCurrentTimeMillis5);
                    } else {
                        d76Var2 = d76Var;
                    }
                } else {
                    d76Var2 = d76Var;
                    if (abstractC0894m3 instanceof xm6) {
                        s56Var.mo5576q((xm6) abstractC0894m3, cp6Var3);
                    } else {
                        if (abstractC0894m3 instanceof yo5) {
                            s56Var.mo5562A((yo5) abstractC0894m3, cp6Var3);
                        } else {
                            oa6Var2 = oa6Var;
                            str3 = null;
                            if (oa6Var2.f26512d.m9225E(null, d56Var2)) {
                                oa6.m9016l(d76Var2);
                                d76Var2.f16835j.m12504a("Discarding data. Unrecognized parcel type.");
                            } else {
                                oa6.m9016l(d76Var2);
                                d76Var2.f16835j.m12504a("Discarding data. Unrecognized parcel type.");
                            }
                        }
                        i5++;
                        cp6Var2 = cp6Var3;
                        d76Var = d76Var2;
                        oa6Var = oa6Var2;
                        op5Var = op5Var;
                        size = size;
                        str2 = str3;
                    }
                }
                oa6Var2 = oa6Var;
                str3 = null;
                i5++;
                cp6Var2 = cp6Var3;
                d76Var = d76Var2;
                oa6Var = oa6Var2;
                op5Var = op5Var;
                size = size;
                str2 = str3;
            }
            int i17 = size;
            op5 op5Var5 = op5Var;
            i7 = i + 1;
            cp6Var4 = cp6Var2;
            d76Var3 = d76Var;
            oa6Var3 = oa6Var;
            op5Var2 = op5Var5;
            ia5Var = ia5Var2;
            i6 = i17;
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m9146P(yo5 yo5Var) {
        boolean zM8202B;
        mo5038t();
        m9741u();
        oa6 oa6Var = (oa6) this.f36084a;
        oa6Var.getClass();
        m66 m66VarM9026m = oa6Var.m9026m();
        oa6 oa6Var2 = (oa6) m66VarM9026m.f36084a;
        oa6.m9014j(oa6Var2.f26517i);
        byte[] bArrM4571Y = dn6.m4571Y(yo5Var);
        byte b = 2;
        if (bArrM4571Y.length > 131072) {
            d76 d76Var = oa6Var2.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16836k.m12504a("Conditional user property too long for local database. Sending directly to service");
            zM8202B = false;
        } else {
            zM8202B = m66VarM9026m.m8202B(2, bArrM4571Y);
        }
        yo5 yo5Var2 = new yo5(yo5Var);
        cp6 cp6VarM9142L = m9142L(true);
        di6 di6Var = new di6(b);
        di6Var.f17089b = cp6VarM9142L;
        di6Var.f17090c = zM8202B;
        di6Var.f17092e = yo5Var2;
        di6Var.f17091d = this;
        VarHandle.storeStoreFence();
        m9140J(di6Var);
    }

    @Override // p000.q56
    /* JADX INFO: renamed from: x */
    public final boolean mo8203x() {
        return false;
    }

    /* JADX INFO: renamed from: y */
    public final void m9147y(AtomicReference atomicReference) {
        mo5038t();
        m9741u();
        cp6 cp6VarM9142L = m9142L(false);
        yn3 yn3Var = new yn3((byte) 19);
        yn3Var.f35360b = atomicReference;
        yn3Var.f35361c = cp6VarM9142L;
        yn3Var.f35362d = this;
        VarHandle.storeStoreFence();
        m9140J(yn3Var);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:14:0x0058  */
    /* JADX INFO: renamed from: z */
    public final void m9148z(Bundle bundle) {
        boolean z;
        boolean zM8202B;
        mo5038t();
        m9741u();
        os5 os5Var = new os5(bundle);
        m9138H();
        oa6 oa6Var = (oa6) this.f36084a;
        if (oa6Var.f26512d.m9225E(null, e56.f17777c1)) {
            m66 m66VarM9026m = oa6Var.m9026m();
            oa6 oa6Var2 = (oa6) m66VarM9026m.f36084a;
            dn6 dn6Var = oa6Var2.f26517i;
            d76 d76Var = oa6Var2.f26514f;
            oa6.m9014j(dn6Var);
            byte[] bArrM4571Y = dn6.m4571Y(os5Var);
            if (bArrM4571Y == null) {
                oa6.m9016l(d76Var);
                d76Var.f16836k.m12504a("Null default event parameters; not writing to database");
            } else {
                if (bArrM4571Y.length > 131072) {
                    oa6.m9016l(d76Var);
                    d76Var.f16836k.m12504a("Default event parameters too long for local database. Sending directly to service");
                } else {
                    zM8202B = m66VarM9026m.m8202B(4, bArrM4571Y);
                }
                if (zM8202B) {
                    z = true;
                } else {
                    z = false;
                }
            }
            zM8202B = false;
            if (zM8202B) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        cp6 cp6VarM9142L = m9142L(false);
        fe6 fe6Var = new fe6((byte) 3);
        fe6Var.f18935e = cp6VarM9142L;
        fe6Var.f18934d = z;
        fe6Var.f18932b = os5Var;
        fe6Var.f18933c = bundle;
        fe6Var.f18936f = this;
        VarHandle.storeStoreFence();
        m9140J(fe6Var);
    }
}
