package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.io.Serializable;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yb6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f35103a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Serializable f35104b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f35105c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f35106d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f35107e;

    public /* synthetic */ yb6(byte b) {
        this.f35103a = b;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:109:0x03e5 A[LOOP:1: B:107:0x03df->B:109:0x03e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x0435 A[Catch: qi6 -> 0x049d, LOOP:2: B:112:0x042b->B:114:0x0435, LOOP_END, TryCatch #2 {qi6 -> 0x049d, blocks: (B:111:0x041e, B:112:0x042b, B:114:0x0435, B:115:0x046b, B:117:0x0485), top: B:130:0x041e }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0485 A[Catch: qi6 -> 0x049d, TRY_LEAVE, TryCatch #2 {qi6 -> 0x049d, blocks: (B:111:0x041e, B:112:0x042b, B:114:0x0435, B:115:0x046b, B:117:0x0485), top: B:130:0x041e }] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundle;
        jl6 jl6Var;
        fa6 fa6Var;
        int i;
        byte b = 5;
        byte b2 = 2;
        byte[] bArrMo5582y = null;
        switch (this.f35103a) {
            case 0:
                jc6 jc6Var = (jc6) this.f35105c;
                String str = (String) this.f35104b;
                ll6 ll6Var = (ll6) this.f35106d;
                b66 b66Var = (b66) this.f35107e;
                qm6 qm6Var = jc6Var.f22167a;
                qm6Var.m9928A();
                qm6Var.mo9020c().mo5038t();
                qm6Var.m9962k0();
                ar5 ar5Var = qm6Var.f28593c;
                qm6.m9925S(ar5Var);
                List<um6> listM3213z = ar5Var.m3213z(str, ll6Var, ((Integer) e56.f17719B.m4379a(null)).intValue());
                ArrayList arrayList = new ArrayList();
                for (um6 um6Var : listM3213z) {
                    String str2 = um6Var.f32000c;
                    long j = um6Var.f32005h;
                    long j2 = um6Var.f31998a;
                    if (qm6Var.m9975s(str, str2)) {
                        int i2 = um6Var.f32006i;
                        if (i2 > 0) {
                            if (i2 <= ((Integer) e56.f17829z.m4379a(bArrMo5582y)).intValue()) {
                                long jMin = Math.min(((Long) e56.f17825x.m4379a(bArrMo5582y)).longValue() * (1 << (i2 - 1)), ((Long) e56.f17827y.m4379a(bArrMo5582y)).longValue());
                                qm6Var.mo9022e().getClass();
                                if (System.currentTimeMillis() >= jMin + j) {
                                    bundle = new Bundle();
                                    for (Map.Entry entry : um6Var.f32001d.entrySet()) {
                                        bundle.putString((String) entry.getKey(), (String) entry.getValue());
                                    }
                                    long j3 = um6Var.f31998a;
                                    pa6 pa6Var = um6Var.f31999b;
                                    jl6Var = new jl6(j3, pa6Var.m5118a(), um6Var.f32000c, bundle, um6Var.f32002e.f16039a, um6Var.f32004g, "");
                                    try {
                                        fa6Var = (fa6) q76.m9777k0(pa6.m9446v(), jl6Var.f22407e);
                                        for (i = 0; i < ((pa6) fa6Var.f31181b).m9453p(); i++) {
                                            qa6 qa6Var = (qa6) ((pa6) fa6Var.f31181b).m9454q(i).m13569g();
                                            qm6Var.mo9022e().getClass();
                                            long jCurrentTimeMillis = System.currentTimeMillis();
                                            qa6Var.m11054c();
                                            ((ua6) qa6Var.f31181b).m11458e0(jCurrentTimeMillis);
                                            fa6Var.m11054c();
                                            ((pa6) fa6Var.f31181b).m9459x(i, (ua6) qa6Var.m11056e());
                                        }
                                        jl6Var.f22407e = ((pa6) fa6Var.m11056e()).m5118a();
                                        if (Log.isLoggable(qm6Var.mo9019b().m4402A(), 2)) {
                                            q76 q76Var = qm6Var.f28597g;
                                            qm6.m9925S(q76Var);
                                            jl6Var.f22412j = q76Var.m9791a0((pa6) fa6Var.m11056e());
                                        }
                                        arrayList.add(jl6Var);
                                    } catch (qi6 unused) {
                                        qm6Var.mo9019b().f16838m.m12505b(str, "Failed to parse queued batch. appId");
                                    }
                                }
                            }
                            qm6Var.mo9019b().f16831L.m12507d("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str, Long.valueOf(j2), Long.valueOf(j));
                        } else {
                            bundle = new Bundle();
                            while (r5.hasNext()) {
                                bundle.putString((String) entry.getKey(), (String) entry.getValue());
                            }
                            long j4 = um6Var.f31998a;
                            pa6 pa6Var2 = um6Var.f31999b;
                            jl6Var = new jl6(j4, pa6Var2.m5118a(), um6Var.f32000c, bundle, um6Var.f32002e.f16039a, um6Var.f32004g, "");
                            fa6Var = (fa6) q76.m9777k0(pa6.m9446v(), jl6Var.f22407e);
                            while (i < ((pa6) fa6Var.f31181b).m9453p()) {
                                qa6 qa6Var2 = (qa6) ((pa6) fa6Var.f31181b).m9454q(i).m13569g();
                                qm6Var.mo9022e().getClass();
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                qa6Var2.m11054c();
                                ((ua6) qa6Var2.f31181b).m11458e0(jCurrentTimeMillis2);
                                fa6Var.m11054c();
                                ((pa6) fa6Var.f31181b).m9459x(i, (ua6) qa6Var2.m11056e());
                            }
                            jl6Var.f22407e = ((pa6) fa6Var.m11056e()).m5118a();
                            if (Log.isLoggable(qm6Var.mo9019b().m4402A(), 2)) {
                                q76 q76Var2 = qm6Var.f28597g;
                                qm6.m9925S(q76Var2);
                                jl6Var.f22412j = q76Var2.m9791a0((pa6) fa6Var.m11056e());
                            }
                            arrayList.add(jl6Var);
                        }
                        bArrMo5582y = null;
                    } else {
                        qm6Var.mo9019b().f16831L.m12507d("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str, Long.valueOf(j2), um6Var.f32000c);
                    }
                }
                try {
                    b66Var.mo2995o(new ol6(arrayList));
                    qm6Var.mo9019b().f16831L.m12506c("[sgtm] Sending queued upload batches to client. appId, count", str, Integer.valueOf(arrayList.size()));
                    return;
                } catch (RemoteException e) {
                    qm6Var.mo9019b().f16835j.m12506c("[sgtm] Failed to return upload batches for app", str, e);
                    return;
                }
            case 1:
                oj6 oj6VarM9027n = ((AppMeasurementDynamiteService) this.f35107e).f16259a.m9027n();
                qx5 qx5Var = (qx5) this.f35105c;
                ys5 ys5Var = (ys5) this.f35106d;
                String str3 = (String) this.f35104b;
                oj6VarM9027n.mo5038t();
                oj6VarM9027n.m9741u();
                oa6 oa6Var = (oa6) oj6VarM9027n.f36084a;
                dn6 dn6Var = oa6Var.f26517i;
                oa6.m9014j(dn6Var);
                if (qt1.f28785b.m10123b(((oa6) dn6Var.f36084a).f26509a, 12451000) != 0) {
                    d76 d76Var = oa6Var.f26514f;
                    oa6.m9016l(d76Var);
                    d76Var.f16838m.m12504a("Not bundling data. Service unavailable or out of date");
                    dn6 dn6Var2 = oa6Var.f26517i;
                    oa6.m9014j(dn6Var2);
                    dn6Var2.m4606f0(qx5Var, new byte[0]);
                    return;
                }
                yb6 yb6Var = new yb6(b);
                yb6Var.f35105c = ys5Var;
                yb6Var.f35104b = str3;
                yb6Var.f35106d = qx5Var;
                yb6Var.f35107e = oj6VarM9027n;
                VarHandle.storeStoreFence();
                oj6VarM9027n.m9140J(yb6Var);
                return;
            case 2:
                jc6 jc6Var2 = (jc6) this.f35105c;
                Bundle bundle2 = (Bundle) this.f35106d;
                String str4 = (String) this.f35104b;
                cp6 cp6Var = (cp6) this.f35107e;
                qm6 qm6Var2 = jc6Var2.f22167a;
                boolean zM9225E = qm6Var2.m9950d0().m9225E(null, e56.f17760V0);
                if (bundle2.isEmpty() && zM9225E) {
                    ar5 ar5Var2 = qm6Var2.f28593c;
                    qm6.m9925S(ar5Var2);
                    ar5Var2.mo5038t();
                    ar5Var2.m10368u();
                    try {
                        ar5Var2.m3197l0().execSQL("delete from default_event_params where app_id=?", new String[]{str4});
                        return;
                    } catch (SQLiteException e2) {
                        d76 d76Var2 = ((oa6) ar5Var2.f36084a).f26514f;
                        oa6.m9016l(d76Var2);
                        d76Var2.f16835j.m12505b(e2, "Error clearing default event params");
                        return;
                    }
                }
                ar5 ar5Var3 = qm6Var2.f28593c;
                qm6.m9925S(ar5Var3);
                oa6 oa6Var2 = (oa6) ar5Var3.f36084a;
                ar5Var3.mo5038t();
                ar5Var3.m10368u();
                cs5 cs5Var = new cs5((oa6) ar5Var3.f36084a, "", str4, "dep", 0L, 0L, bundle2);
                q76 q76Var3 = ar5Var3.f19870f.f28597g;
                qm6.m9925S(q76Var3);
                byte[] bArrM5118a = q76Var3.m9790Z(cs5Var).m5118a();
                d76 d76Var3 = oa6Var2.f26514f;
                oa6.m9016l(d76Var3);
                d76Var3.f16831L.m12506c("Saving default event parameters, appId, data size", str4, Integer.valueOf(bArrM5118a.length));
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str4);
                contentValues.put("parameters", bArrM5118a);
                try {
                    if (ar5Var3.m3197l0().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                        oa6.m9016l(d76Var3);
                        d76Var3.f16835j.m12505b(d76.m4401y(str4), "Failed to insert default event parameters (got -1). appId");
                    }
                } catch (SQLiteException e3) {
                    oa6.m9016l(d76Var3);
                    d76Var3.f16835j.m12506c("Error storing default event parameters. appId", d76.m4401y(str4), e3);
                }
                ar5 ar5Var4 = qm6Var2.f28593c;
                qm6.m9925S(ar5Var4);
                long j5 = cp6Var.f16347G;
                try {
                    if (ar5Var4.m3179R("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str4, String.valueOf(j5)}, 0L) <= 0 && ar5Var4.m3179R("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str4, String.valueOf(j5)}, 0L) > 0) {
                        ar5 ar5Var5 = qm6Var2.f28593c;
                        qm6.m9925S(ar5Var5);
                        ar5Var5.m3176O(str4, Long.valueOf(j5), null, bundle2);
                        return;
                    }
                    return;
                } catch (SQLiteException e4) {
                    d76 d76Var4 = ((oa6) ar5Var4.f36084a).f26514f;
                    oa6.m9016l(d76Var4);
                    d76Var4.f16835j.m12505b(e4, "Error checking backfill conditions");
                    return;
                }
            case 3:
                String str5 = (String) this.f35104b;
                String str6 = (String) this.f35106d;
                oj6 oj6VarM9027n2 = ((oa6) ((mg6) this.f35107e).f36084a).m9027n();
                AtomicReference atomicReference = (AtomicReference) this.f35105c;
                oj6VarM9027n2.mo5038t();
                oj6VarM9027n2.m9741u();
                cp6 cp6VarM9142L = oj6VarM9027n2.m9142L(false);
                wb6 wb6Var = new wb6((byte) 1);
                wb6Var.f33226d = atomicReference;
                wb6Var.f33224b = str5;
                wb6Var.f33227e = str6;
                wb6Var.f33225c = cp6VarM9142L;
                wb6Var.f33228f = oj6VarM9027n2;
                VarHandle.storeStoreFence();
                oj6VarM9027n2.m9140J(wb6Var);
                return;
            case 4:
                oj6 oj6VarM9027n3 = ((AppMeasurementDynamiteService) this.f35107e).f16259a.m9027n();
                qx5 qx5Var2 = (qx5) this.f35105c;
                String str7 = (String) this.f35104b;
                String str8 = (String) this.f35106d;
                oj6VarM9027n3.mo5038t();
                oj6VarM9027n3.m9741u();
                cp6 cp6VarM9142L2 = oj6VarM9027n3.m9142L(false);
                wb6 wb6Var2 = new wb6(b2);
                wb6Var2.f33224b = str7;
                wb6Var2.f33226d = str8;
                wb6Var2.f33225c = cp6VarM9142L2;
                wb6Var2.f33227e = qx5Var2;
                wb6Var2.f33228f = oj6VarM9027n3;
                VarHandle.storeStoreFence();
                oj6VarM9027n3.m9140J(wb6Var2);
                return;
            case 5:
                qx5 qx5Var3 = (qx5) this.f35106d;
                oj6 oj6Var = (oj6) this.f35107e;
                oa6 oa6Var3 = (oa6) oj6Var.f36084a;
                try {
                    try {
                        s56 s56Var = oj6Var.f26789h;
                        if (s56Var != null) {
                            bArrMo5582y = s56Var.mo5582y((String) this.f35104b, (ys5) this.f35105c);
                            oj6Var.m9139I();
                            return;
                        } else {
                            d76 d76Var5 = oa6Var3.f26514f;
                            oa6.m9016l(d76Var5);
                            d76Var5.f16835j.m12504a("Discarding data. Failed to send event to service to bundle");
                            return;
                        }
                    } catch (RemoteException e5) {
                        d76 d76Var6 = oa6Var3.f26514f;
                        oa6.m9016l(d76Var6);
                        d76Var6.f16835j.m12505b(e5, "Failed to send event to the service to bundle");
                    }
                } finally {
                    dn6 dn6Var3 = oa6Var3.f26517i;
                    oa6.m9014j(dn6Var3);
                    dn6Var3.m4606f0(qx5Var3, null);
                }
                break;
            case 6:
                oj6 oj6Var2 = (oj6) this.f35105c;
                AtomicReference atomicReference2 = (AtomicReference) this.f35104b;
                cp6 cp6Var2 = (cp6) this.f35106d;
                Bundle bundle3 = (Bundle) this.f35107e;
                synchronized (atomicReference2) {
                    try {
                        s56 s56Var2 = oj6Var2.f26789h;
                        if (s56Var2 != null) {
                            s56Var2.mo5563B(cp6Var2, bundle3, new yh6(oj6Var2, atomicReference2));
                            oj6Var2.m9139I();
                            return;
                        } else {
                            d76 d76Var7 = ((oa6) oj6Var2.f36084a).f26514f;
                            oa6.m9016l(d76Var7);
                            d76Var7.f16835j.m12504a("Failed to request trigger URIs; not connected to service");
                            return;
                        }
                    } catch (RemoteException e6) {
                        d76 d76Var8 = ((oa6) oj6Var2.f36084a).f26514f;
                        oa6.m9016l(d76Var8);
                        d76Var8.f16835j.m12505b(e6, "Failed to request trigger URIs; remote exception");
                        atomicReference2.notifyAll();
                    }
                }
                break;
            case 7:
                oj6 oj6Var3 = (oj6) this.f35105c;
                AtomicReference atomicReference3 = (AtomicReference) this.f35104b;
                cp6 cp6Var3 = (cp6) this.f35107e;
                ll6 ll6Var2 = (ll6) this.f35106d;
                synchronized (atomicReference3) {
                    try {
                        s56 s56Var3 = oj6Var3.f26789h;
                        if (s56Var3 != null) {
                            s56Var3.mo5564C(cp6Var3, ll6Var2, new ai6(oj6Var3, atomicReference3));
                            oj6Var3.m9139I();
                            return;
                        } else {
                            d76 d76Var9 = ((oa6) oj6Var3.f36084a).f26514f;
                            oa6.m9016l(d76Var9);
                            d76Var9.f16835j.m12504a("[sgtm] Failed to get upload batches; not connected to service");
                            return;
                        }
                    } catch (RemoteException e7) {
                        d76 d76Var10 = ((oa6) oj6Var3.f36084a).f26514f;
                        oa6.m9016l(d76Var10);
                        d76Var10.f16835j.m12505b(e7, "[sgtm] Failed to get upload batches; remote exception");
                        atomicReference3.notifyAll();
                    }
                }
                break;
            default:
                qm6 qm6Var3 = (qm6) ((bt5) this.f35107e).f15596b;
                dn6 dn6VarM9960j0 = qm6Var3.m9960j0();
                qm6Var3.mo9022e().getClass();
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                String str9 = (String) this.f35104b;
                ys5 ys5VarM4598W = dn6VarM9960j0.m4598W((String) this.f35105c, (Bundle) this.f35106d, "auto", jCurrentTimeMillis3, false);
                y42.m12854a0(ys5VarM4598W);
                qm6Var3.m9955h(str9, ys5VarM4598W);
                return;
        }
    }
}
