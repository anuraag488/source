package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n41 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f25439a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ o41 f25440b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ mq4 f25441c;

    public /* synthetic */ n41(byte b) {
        this.f25439a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        on4 on4Var;
        switch (this.f25439a) {
            case 0:
                pc0 pc0Var = pc0.f27519d;
                yp1 yp1Var = this.f25440b.f26321b;
                y41 y41Var = (y41) obj;
                yp1 yp1Var2 = y41Var.f34857l == pc0Var ? yp1Var : (yp1) this.f25441c.f25142c;
                return (yp1Var2 == null || (on4Var = (on4) yp1Var2.invoke(y41Var)) == null) ? (on4) yp1Var.invoke(y41Var) : on4Var;
            case 1:
                pc0 pc0Var2 = pc0.f27519d;
                yp1 yp1Var3 = this.f25440b.f26322c;
                y41 y41Var2 = (y41) obj;
                yp1 yp1Var4 = y41Var2.f34857l == pc0Var2 ? yp1Var3 : (yp1) this.f25441c.f25143d;
                return Double.valueOf(((Number) (yp1Var4 != null ? yp1Var4.invoke(y41Var2) : yp1Var3.invoke(y41Var2))).doubleValue());
            case 2:
                y41 y41Var3 = (y41) obj;
                yp1 yp1Var5 = y41Var3.f34857l == pc0.f27519d ? this.f25440b.f26324e : this.f25441c.f25144e;
                return yp1Var5 != null ? (Double) yp1Var5.invoke(y41Var3) : Double.valueOf(1.0d);
            case 3:
                y41 y41Var4 = (y41) obj;
                yp1 yp1Var6 = y41Var4.f34857l == pc0.f27519d ? this.f25440b.f26325f : (yp1) this.f25441c.f25145f;
                if (yp1Var6 != null) {
                    return (o41) yp1Var6.invoke(y41Var4);
                }
                return null;
            case 4:
                y41 y41Var5 = (y41) obj;
                yp1 yp1Var7 = y41Var5.f34857l == pc0.f27519d ? this.f25440b.f26326g : (yp1) this.f25441c.f25146g;
                if (yp1Var7 != null) {
                    return (o41) yp1Var7.invoke(y41Var5);
                }
                return null;
            case 5:
                y41 y41Var6 = (y41) obj;
                yp1 yp1Var8 = y41Var6.f34857l == pc0.f27519d ? this.f25440b.f26327h : (yp1) this.f25441c.f25147h;
                if (yp1Var8 != null) {
                    return (bn0) yp1Var8.invoke(y41Var6);
                }
                return null;
            case 6:
                y41 y41Var7 = (y41) obj;
                yp1 yp1Var9 = y41Var7.f34857l == pc0.f27519d ? this.f25440b.f26328i : (yp1) this.f25441c.f25148i;
                if (yp1Var9 != null) {
                    return (sn4) yp1Var9.invoke(y41Var7);
                }
                return null;
            default:
                y41 y41Var8 = (y41) obj;
                n41 n41Var = y41Var8.f34857l == pc0.f27519d ? this.f25440b.f26329j : (n41) this.f25441c.f25149j;
                if (n41Var != null) {
                    return (Double) n41Var.invoke(y41Var8);
                }
                return null;
        }
    }
}
