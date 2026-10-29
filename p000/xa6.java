package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xa6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f34119a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ cp6 f34120b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ jc6 f34121c;

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f34119a) {
            case 0:
                qm6 qm6Var = this.f34121c.f22167a;
                qm6Var.m9928A();
                cp6 cp6Var = this.f34120b;
                qm6Var.mo9020c().mo5038t();
                qm6Var.m9962k0();
                y42.m12854a0(cp6Var);
                String str = cp6Var.f16349d;
                y42.m12851X(str);
                int i = 0;
                if (qm6Var.m9950d0().m9225E(null, e56.f17830z0)) {
                    qm6Var.mo9022e().getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int iM9223C = qm6Var.m9950d0().m9223C(null, e56.f17794i0);
                    qm6Var.m9950d0();
                    long jLongValue = jCurrentTimeMillis - ((Long) e56.f17781e.m4379a(null)).longValue();
                    while (i < iM9223C && qm6Var.m9932G(null, jLongValue)) {
                        i++;
                    }
                } else {
                    qm6Var.m9950d0();
                    long jIntValue = ((Integer) e56.f17801l.m4379a(null)).intValue();
                    while (i < jIntValue && qm6Var.m9932G(str, 0L)) {
                        i++;
                    }
                }
                if (qm6Var.m9950d0().m9225E(null, e56.f17718A0)) {
                    qm6Var.mo9020c().mo5038t();
                    qm6Var.m9931F();
                }
                vl6 vl6Var = qm6Var.f28600j;
                int iM10835a = sk5.m10835a(cp6Var.f16348H);
                vl6Var.mo5038t();
                if (iM10835a == 2 && !vl6.m11931w(str)) {
                    n96 n96Var = vl6Var.f19870f.f28591a;
                    qm6.m9925S(n96Var);
                    n66 n66VarM8642G = n96Var.m8642G(str);
                    if (n66VarM8642G != null && n66VarM8642G.m8551C() && !n66VarM8642G.m8552D().m6691p().isEmpty()) {
                        qm6Var.mo9019b().f16831L.m12505b(str, "[sgtm] Going background, trigger client side upload. appId");
                        qm6Var.mo9022e().getClass();
                        qm6Var.m9974r(str, System.currentTimeMillis());
                        break;
                    }
                }
                break;
            case 1:
                qm6 qm6Var2 = this.f34121c.f22167a;
                qm6Var2.m9928A();
                qm6Var2.mo9020c().mo5038t();
                qm6Var2.m9962k0();
                cp6 cp6Var2 = this.f34120b;
                y42.m12851X(cp6Var2.f16349d);
                qm6Var2.m9948a0(cp6Var2);
                break;
            default:
                qm6 qm6Var3 = this.f34121c.f22167a;
                qm6Var3.m9928A();
                qm6Var3.mo9020c().mo5038t();
                qm6Var3.m9962k0();
                cp6 cp6Var3 = this.f34120b;
                y42.m12851X(cp6Var3.f16349d);
                qm6Var3.m9964l0(cp6Var3);
                qm6Var3.m9966m0(cp6Var3);
                break;
        }
    }
}
