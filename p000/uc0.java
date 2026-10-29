package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uc0 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f31779a;

    public /* synthetic */ uc0(byte b) {
        this.f31779a = b;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0046  */
    @Override // p000.yp1
    public final Object invoke(Object obj) {
        double d;
        double d2;
        double d3;
        double d4;
        byte b = this.f31779a;
        double dM76n = 10.0d;
        double d5 = 20.0d;
        dd0 dd0Var = jq2.f22514a;
        double d6 = 90.0d;
        switch (b) {
            case 0:
                return ((y41) obj).f34853h;
            case 1:
                return Double.valueOf(((y41) obj).f34848c ? 20.0d : 95.0d);
            case 2:
                return dd0Var.mo4466m();
            case 3:
                return new bn0(4.5d, 7.0d, 11.0d, 21.0d);
            case 4:
                return Double.valueOf(((y41) obj).f34848c ? 30.0d : 90.0d);
            case 5:
                return ((y41) obj).f34851f;
            case 6:
                return Double.valueOf(((y41) obj).f34847b != pw4.f28051a ? 90.0d : 80.0d);
            case 7:
                return new bn0(1.0d, 1.0d, 3.0d, 4.5d);
            case 8:
                return ((y41) obj).f34850e;
            case 9:
                y41 y41Var = (y41) obj;
                pw4 pw4Var = y41Var.f34847b;
                pw4 pw4Var2 = pw4.f28051a;
                boolean z = y41Var.f34848c;
                if (pw4Var != pw4Var2) {
                    dM76n = z ? 20.0d : 100.0d;
                } else if (!z) {
                    dM76n = 90.0d;
                }
                return Double.valueOf(dM76n);
            case 10:
                return dd0Var.mo4467o();
            case 11:
                return new bn0(4.5d, 7.0d, 11.0d, 21.0d);
            case 12:
                return ((y41) obj).f34853h;
            case 13:
                y41 y41Var2 = (y41) obj;
                double d7 = y41Var2.f34849d;
                if (!y41Var2.f34848c) {
                    if (d7 <= -1.0d) {
                        d6 = 94.0d;
                    } else {
                        if (d7 < 0.0d) {
                            double d8 = (d7 - (-1.0d)) / 1.0d;
                            d = (1.0d - d8) * 94.0d;
                            d2 = d8 * 94.0d;
                        } else if (d7 < 0.5d) {
                            double d9 = (d7 - 0.0d) / 0.5d;
                            d = (1.0d - d9) * 94.0d;
                            d2 = d9 * 92.0d;
                        } else if (d7 < 1.0d) {
                            double d10 = (d7 - 0.5d) / 0.5d;
                            d = (1.0d - d10) * 92.0d;
                            d2 = d10 * 90.0d;
                        }
                        d6 = d2 + d;
                    }
                    d5 = d6;
                } else if (d7 <= -1.0d) {
                    d5 = 12.0d;
                } else {
                    if (d7 < 0.0d) {
                        double d11 = (d7 - (-1.0d)) / 1.0d;
                        d3 = (1.0d - d11) * 12.0d;
                        d4 = d11 * 12.0d;
                    } else if (d7 < 0.5d) {
                        double d12 = (d7 - 0.0d) / 0.5d;
                        d3 = (1.0d - d12) * 12.0d;
                        d4 = d12 * 16.0d;
                    } else if (d7 < 1.0d) {
                        double d13 = (d7 - 0.5d) / 0.5d;
                        d3 = (1.0d - d13) * 16.0d;
                        d4 = d13 * 20.0d;
                    }
                    d5 = d4 + d3;
                }
                return Double.valueOf(d5);
            case 14:
                return ((y41) obj).f34850e;
            case 15:
                return ((y41) obj).f34854i;
            case 16:
                return Double.valueOf(((y41) obj).f34848c ? 60.0d : 50.0d);
            case 17:
                return new bn0(1.5d, 3.0d, 4.5d, 7.0d);
            case 18:
                return ((y41) obj).f34850e;
            case 19:
                return Double.valueOf(((y41) obj).f34847b != pw4.f28051a ? 80.0d : 30.0d);
            case 20:
                return new bn0(1.0d, 1.0d, 3.0d, 4.5d);
            case 21:
                return ((y41) obj).f34851f;
            case 22:
                return Double.valueOf(((y41) obj).f34847b == pw4.f28051a ? 70.0d : 80.0d);
            case 23:
                return new bn0(1.0d, 1.0d, 3.0d, 4.5d);
            case 24:
                return Double.valueOf(((y41) obj).f34848c ? 80.0d : 40.0d);
            case 25:
                return ((y41) obj).f34851f;
            case 26:
                y41 y41Var3 = (y41) obj;
                boolean z2 = y41Var3.f34848c;
                if (y41Var3.f34847b == pw4.f28051a) {
                    if (z2) {
                        dM76n = 90.0d;
                    }
                } else if (wc0.m12212n(y41Var3)) {
                    dM76n = C0006a5.m76n(((Number) dd0Var.mo4472t().f26322c.invoke(y41Var3)).doubleValue(), 4.5d);
                } else if (z2) {
                    dM76n = 90.0d;
                } else {
                    dM76n = 30.0d;
                }
                return Double.valueOf(dM76n);
            case 27:
                return dd0Var.mo4472t();
            case 28:
                return new bn0(3.0d, 4.5d, 7.0d, 11.0d);
            default:
                return ((y41) obj).f34850e;
        }
    }
}
