package p000;

import android.app.AlarmManager;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.lang.invoke.VarHandle;
import java.util.HashMap;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fk6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f19063a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f19064b;

    public /* synthetic */ fk6(byte b) {
        this.f19063a = b;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x02a9  */
    @Override // java.lang.Runnable
    public final void run() {
        byte b = 0;
        byte b2 = 1;
        switch (this.f19063a) {
            case 0:
                hk6 hk6Var = (hk6) this.f19064b;
                vk6 vk6Var = (vk6) hk6Var.f20667c.f35216c;
                vk6Var.mo5038t();
                oa6 oa6Var = (oa6) vk6Var.f36084a;
                d76 d76Var = oa6Var.f26514f;
                Context context = oa6Var.f26509a;
                oa6.m9016l(d76Var);
                d76Var.f16842q.m12504a("Application going to the background");
                s86 s86Var = oa6Var.f26513e;
                oa6.m9014j(s86Var);
                s86Var.f29978Q.m6281b(true);
                vk6Var.mo5038t();
                vk6Var.f32707h = true;
                op5 op5Var = oa6Var.f26512d;
                if (!op5Var.m9229I()) {
                    long j = hk6Var.f20666b;
                    dx4 dx4Var = vk6Var.f32709j;
                    dx4Var.m4793e(false, false, j);
                    ((kk6) dx4Var.f17484c).m6924c();
                }
                long j2 = hk6Var.f20665a;
                oa6.m9016l(d76Var);
                d76Var.f16841p.m12505b(Long.valueOf(j2), "Application backgrounded at: timestamp_millis");
                mg6 mg6Var = oa6Var.f26521m;
                oa6.m9015k(mg6Var);
                mg6Var.mo5038t();
                oa6 oa6Var2 = (oa6) mg6Var.f36084a;
                mg6Var.m9741u();
                oj6 oj6VarM9027n = oa6Var2.m9027n();
                oj6VarM9027n.mo5038t();
                oj6VarM9027n.m9741u();
                if (oj6VarM9027n.m9133B()) {
                    dn6 dn6Var = ((oa6) oj6VarM9027n.f36084a).f26517i;
                    oa6.m9014j(dn6Var);
                    if (dn6Var.m4601a0() >= 242600) {
                        oj6 oj6VarM9027n2 = oa6Var2.m9027n();
                        oj6VarM9027n2.mo5038t();
                        oj6VarM9027n2.m9741u();
                        cp6 cp6VarM9142L = oj6VarM9027n2.m9142L(true);
                        ei6 ei6Var = new ei6(b2);
                        ei6Var.f18126b = cp6VarM9142L;
                        ei6Var.f18127c = oj6VarM9027n2;
                        VarHandle.storeStoreFence();
                        oj6VarM9027n2.m9140J(ei6Var);
                    }
                } else {
                    oj6 oj6VarM9027n3 = oa6Var2.m9027n();
                    oj6VarM9027n3.mo5038t();
                    oj6VarM9027n3.m9741u();
                    cp6 cp6VarM9142L2 = oj6VarM9027n3.m9142L(true);
                    ei6 ei6Var2 = new ei6(b2);
                    ei6Var2.f18126b = cp6VarM9142L2;
                    ei6Var2.f18127c = oj6VarM9027n3;
                    VarHandle.storeStoreFence();
                    oj6VarM9027n3.m9140J(ei6Var2);
                }
                if (op5Var.m9225E(null, e56.f17744N0)) {
                    dn6 dn6Var2 = oa6Var.f26517i;
                    oa6.m9014j(dn6Var2);
                    long jM9222B = dn6Var2.m4596U(context.getPackageName(), op5Var.f26943g) ? 1000L : op5Var.m9222B(context.getPackageName(), e56.f17725E);
                    oa6.m9016l(d76Var);
                    d76Var.f16831L.m12505b(Long.valueOf(jM9222B), "[sgtm] Scheduling batch upload with minimum latency in millis");
                    oa6.m9013i(oa6Var.f26529u);
                    oa6Var.f26529u.m13551y(jM9222B);
                }
                break;
            case 1:
                qm6 qm6Var = (qm6) this.f19064b;
                qm6Var.mo9020c().mo5038t();
                y86 y86Var = new y86(b);
                y86Var.f35029b = qm6Var.f28602l;
                VarHandle.storeStoreFence();
                qm6Var.f28601k = y86Var;
                ar5 ar5Var = new ar5(qm6Var);
                oa6 oa6Var3 = (oa6) ar5Var.f36084a;
                ar5Var.f14826i = new al6(oa6Var3.f26519k);
                ar5Var.f14825h = new wq5(ar5Var, oa6Var3.f26509a);
                VarHandle.storeStoreFence();
                ar5Var.m10369v();
                qm6Var.f28593c = ar5Var;
                n96 n96Var = qm6Var.f28591a;
                op5 op5VarM9950d0 = qm6Var.m9950d0();
                y42.m12854a0(n96Var);
                op5VarM9950d0.f26944h = n96Var;
                rj6 rj6Var = new rj6(qm6Var);
                rj6Var.f29362h = new HashMap();
                oa6 oa6Var4 = (oa6) rj6Var.f36084a;
                s86 s86Var2 = oa6Var4.f26513e;
                oa6.m9014j(s86Var2);
                rj6Var.f29363i = new n86(s86Var2, "last_delete_stale", 0L);
                s86 s86Var3 = oa6Var4.f26513e;
                oa6.m9014j(s86Var3);
                rj6Var.f29364j = new n86(s86Var3, "last_delete_stale_batch", 0L);
                rj6Var.f29365k = new n86(s86Var3, "backoff", 0L);
                rj6Var.f29366l = new n86(s86Var3, "last_upload", 0L);
                rj6Var.f29367m = new n86(s86Var3, "last_upload_attempt", 0L);
                rj6Var.f29368n = new n86(s86Var3, "midnight_offset", 0L);
                VarHandle.storeStoreFence();
                rj6Var.m10369v();
                qm6Var.f28599i = rj6Var;
                vn5 vn5Var = new vn5(qm6Var);
                vn5Var.m10369v();
                qm6Var.f28596f = vn5Var;
                q76 q76Var = new q76(qm6Var, b2);
                q76Var.m10369v();
                qm6Var.f28598h = q76Var;
                fl6 fl6Var = new fl6(qm6Var);
                fl6Var.f19105h = (AlarmManager) ((oa6) fl6Var.f36084a).f26509a.getSystemService("alarm");
                VarHandle.storeStoreFence();
                fl6Var.m10369v();
                qm6Var.f28595e = fl6Var;
                e86 e86Var = new e86();
                e86Var.f17899d = qm6Var;
                VarHandle.storeStoreFence();
                qm6Var.f28594d = e86Var;
                if (qm6Var.f28608r != qm6Var.f28609s) {
                    qm6Var.mo9019b().f16835j.m12506c("Not all upload components initialized", Integer.valueOf(qm6Var.f28608r), Integer.valueOf(qm6Var.f28609s));
                }
                qm6Var.f28603m.set(true);
                qm6Var.mo9019b().f16831L.m12504a("UploadController is now fully initialized");
                qm6Var.mo9020c().mo5038t();
                ar5 ar5Var2 = qm6Var.f28593c;
                qm6.m9925S(ar5Var2);
                ar5Var2.m3166E();
                ar5 ar5Var3 = qm6Var.f28593c;
                qm6.m9925S(ar5Var3);
                ar5Var3.mo5038t();
                ar5Var3.m10368u();
                if (ar5Var3.m3192f0()) {
                    d56 d56Var = e56.f17822v0;
                    if (((Long) d56Var.m4379a(null)).longValue() != 0) {
                        SQLiteDatabase sQLiteDatabaseM3197l0 = ar5Var3.m3197l0();
                        oa6 oa6Var5 = (oa6) ar5Var3.f36084a;
                        oa6Var5.f26519k.getClass();
                        int iDelete = sQLiteDatabaseM3197l0.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(d56Var.m4379a(null))});
                        if (iDelete > 0) {
                            d76 d76Var2 = oa6Var5.f26514f;
                            oa6.m9016l(d76Var2);
                            d76Var2.f16831L.m12505b(Integer.valueOf(iDelete), "Deleted stale trigger uris. rowsDeleted");
                        }
                    }
                }
                if (qm6Var.f28599i.f29366l.m8623a() == 0) {
                    n86 n86Var = qm6Var.f28599i.f29366l;
                    qm6Var.mo9022e().getClass();
                    n86Var.m8624b(System.currentTimeMillis());
                }
                qm6Var.m9936L();
                break;
            case 2:
                NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = (NetworkChangeNotifierAutoDetect) this.f19064b;
                if (!networkChangeNotifierAutoDetect.mIgnoreNextBroadcast) {
                    networkChangeNotifierAutoDetect.connectionTypeChanged();
                } else {
                    networkChangeNotifierAutoDetect.mIgnoreNextBroadcast = false;
                }
                break;
            case 3:
                ((cl0) this.f19064b).mo3141i();
                break;
            case 4:
                oa6 oa6Var6 = (oa6) ((o30) this.f19064b).f26313b;
                oa6.m9013i(oa6Var6.f26529u);
                oa6Var6.f26529u.m13551y(((Long) e56.f17723D.m4379a(null)).longValue());
                break;
            default:
                oa6 oa6Var7 = (oa6) this.f19064b;
                dn6 dn6Var3 = oa6Var7.f26517i;
                mg6 mg6Var2 = oa6Var7.f26521m;
                oa6.m9014j(dn6Var3);
                dn6Var3.mo5038t();
                if (dn6Var3.m4594P() != 1) {
                    d76 d76Var3 = oa6Var7.f26514f;
                    oa6.m9016l(d76Var3);
                    d76Var3.f16838m.m12504a("registerTrigger called but app not eligible");
                } else {
                    oa6.m9015k(mg6Var2);
                    mg6Var2.mo5038t();
                    nd6 nd6Var = mg6Var2.f24907p;
                    if (nd6Var != null) {
                        nd6Var.m6924c();
                    }
                    oa6.m9015k(mg6Var2);
                    ld6 ld6Var = new ld6((byte) 3);
                    ld6Var.f23966b = mg6Var2;
                    VarHandle.storeStoreFence();
                    new Thread(ld6Var).start();
                }
                break;
        }
    }
}
