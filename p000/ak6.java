package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ak6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f14601a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ long f14602b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ vk6 f14603c;

    public /* synthetic */ ak6(byte b) {
        this.f14601a = b;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00ba  */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14601a) {
            case 0:
                vk6 vk6Var = this.f14603c;
                long j = this.f14602b;
                dx4 dx4Var = vk6Var.f32709j;
                vk6Var.mo5038t();
                vk6Var.m11924y();
                oa6 oa6Var = (oa6) vk6Var.f36084a;
                d76 d76Var = oa6Var.f26514f;
                oa6.m9016l(d76Var);
                d76Var.f16831L.m12505b(Long.valueOf(j), "Activity resumed, time");
                op5 op5Var = oa6Var.f26512d;
                if (op5Var.m9225E(null, e56.f17758U0)) {
                    if (op5Var.m9229I() || vk6Var.f32707h) {
                        ((vk6) dx4Var.f17485d).mo5038t();
                        ((kk6) dx4Var.f17484c).m6924c();
                        dx4Var.f17482a = j;
                        dx4Var.f17483b = j;
                    }
                } else if (op5Var.m9229I()) {
                    ((vk6) dx4Var.f17485d).mo5038t();
                    ((kk6) dx4Var.f17484c).m6924c();
                    dx4Var.f17482a = j;
                    dx4Var.f17483b = j;
                } else {
                    s86 s86Var = oa6Var.f26513e;
                    oa6.m9014j(s86Var);
                    if (s86Var.f29978Q.m6280a()) {
                        ((vk6) dx4Var.f17485d).mo5038t();
                        ((kk6) dx4Var.f17484c).m6924c();
                        dx4Var.f17482a = j;
                        dx4Var.f17483b = j;
                    }
                }
                yg3 yg3Var = vk6Var.f32710k;
                vk6 vk6Var2 = (vk6) yg3Var.f35216c;
                vk6Var2.mo5038t();
                oa6 oa6Var2 = (oa6) vk6Var2.f36084a;
                hk6 hk6Var = (hk6) yg3Var.f35215b;
                if (hk6Var != null) {
                    vk6Var2.f32706g.removeCallbacks(hk6Var);
                }
                s86 s86Var2 = oa6Var2.f26513e;
                mg6 mg6Var = oa6Var2.f26521m;
                oa6.m9014j(s86Var2);
                s86Var2.f29978Q.m6281b(false);
                vk6Var2.mo5038t();
                vk6Var2.f32707h = false;
                if (oa6Var2.f26512d.m9225E(null, e56.f17756T0)) {
                    oa6.m9015k(mg6Var);
                    if (mg6Var.f24888L) {
                        d76 d76Var2 = oa6Var2.f26514f;
                        oa6.m9016l(d76Var2);
                        d76Var2.f16831L.m12504a("Retrying trigger URI registration in foreground");
                        oa6.m9015k(mg6Var);
                        mg6Var.m8319W();
                    }
                }
                rr5 rr5Var = vk6Var.f32708i;
                vk6 vk6Var3 = (vk6) rr5Var.f29555b;
                vk6Var3.mo5038t();
                oa6 oa6Var3 = (oa6) vk6Var3.f36084a;
                if (oa6Var3.m9018a()) {
                    oa6Var3.f26519k.getClass();
                    rr5Var.m10417g(System.currentTimeMillis());
                    break;
                }
                break;
            default:
                vk6 vk6Var4 = this.f14603c;
                long j2 = this.f14602b;
                vk6Var4.mo5038t();
                vk6Var4.m11924y();
                oa6 oa6Var4 = (oa6) vk6Var4.f36084a;
                d76 d76Var3 = oa6Var4.f26514f;
                oa6.m9016l(d76Var3);
                d76Var3.f16831L.m12505b(Long.valueOf(j2), "Activity paused, time");
                yg3 yg3Var2 = vk6Var4.f32710k;
                vk6 vk6Var5 = (vk6) yg3Var2.f35216c;
                ((oa6) vk6Var5.f36084a).f26519k.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                hk6 hk6Var2 = new hk6();
                hk6Var2.f20667c = yg3Var2;
                hk6Var2.f20665a = jCurrentTimeMillis;
                hk6Var2.f20666b = j2;
                VarHandle.storeStoreFence();
                yg3Var2.f35215b = hk6Var2;
                vk6Var5.f32706g.postDelayed(hk6Var2, 2000L);
                if (oa6Var4.f26512d.m9229I()) {
                    ((kk6) vk6Var4.f32709j.f17484c).m6924c();
                }
                break;
        }
    }
}
