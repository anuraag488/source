package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tc0 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f31067a;

    public /* synthetic */ tc0(byte b) {
        this.f31067a = b;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0032 A[PHI: r9
  0x0032: PHI (r9v6 double) = (r9v3 double), (r9v4 double), (r9v7 double) binds: [B:20:0x005a, B:31:0x007c, B:7:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.yp1
    public final Object invoke(Object obj) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        byte b = this.f31067a;
        double d7 = 40.0d;
        double dM76n = 30.0d;
        double d8 = 25.0d;
        dd0 dd0Var = jq2.f22514a;
        switch (b) {
            case 0:
                return Double.valueOf(((y41) obj).f34848c ? 80.0d : 40.0d);
            case 1:
                return new bn0(3.0d, 4.5d, 7.0d, 7.0d);
            case 2:
                return ((y41) obj).f34851f;
            case 3:
                return ((y41) obj).f34853h;
            case 4:
                return Double.valueOf(10.0d);
            case 5:
                return dd0Var.mo4474v();
            case 6:
                return dd0Var.mo4473u();
            case 7:
                return new bn0(4.5d, 7.0d, 11.0d, 21.0d);
            case 8:
                return ((y41) obj).f34856k;
            case 9:
                return Double.valueOf(((y41) obj).f34848c ? 20.0d : 100.0d);
            case 10:
                return dd0Var.mo4456b();
            case 11:
                return new bn0(4.5d, 7.0d, 11.0d, 21.0d);
            case 12:
                return ((y41) obj).f34852g;
            case 13:
                y41 y41Var = (y41) obj;
                pw4 pw4Var = y41Var.f34847b;
                pw4 pw4Var2 = pw4.f28051a;
                boolean z = y41Var.f34848c;
                if (pw4Var == pw4Var2) {
                    d7 = z ? 90.0d : 25.0d;
                } else if (z) {
                    d7 = 80.0d;
                }
                return Double.valueOf(d7);
            case 14:
                return Double.valueOf(((y41) obj).f34848c ? 6.0d : 98.0d);
            case 15:
                return new bn0(3.0d, 4.5d, 7.0d, 7.0d);
            case 16:
                return ((y41) obj).f34856k;
            case 17:
                return Double.valueOf(((y41) obj).f34848c ? 30.0d : 90.0d);
            case 18:
                return new bn0(1.0d, 1.0d, 3.0d, 4.5d);
            case 19:
                return ((y41) obj).f34853h;
            case 20:
                return Double.valueOf(((y41) obj).f34848c ? 90.0d : 10.0d);
            case 21:
                return dd0Var.mo4455a();
            case 22:
                return new bn0(3.0d, 3.0d, 4.5d, 7.0d);
            case 23:
                return ((y41) obj).f34854i;
            case 24:
                return ((y41) obj).f34850e;
            case 25:
                y41 y41Var2 = (y41) obj;
                if (wc0.m12212n(y41Var2)) {
                    dM76n = C0006a5.m76n(((Number) dd0Var.mo4468p().f26322c.invoke(y41Var2)).doubleValue(), 4.5d);
                } else {
                    pw4 pw4Var3 = y41Var2.f34847b;
                    pw4 pw4Var4 = pw4.f28051a;
                    boolean z2 = y41Var2.f34848c;
                    if (pw4Var3 == pw4Var4) {
                        dM76n = z2 ? 0.0d : 100.0d;
                    } else if (z2) {
                        dM76n = 90.0d;
                    }
                }
                return Double.valueOf(dM76n);
            case 26:
                return dd0Var.mo4468p();
            case 27:
                return new bn0(3.0d, 4.5d, 7.0d, 11.0d);
            case 28:
                return ((y41) obj).f34853h;
            default:
                y41 y41Var3 = (y41) obj;
                double d9 = y41Var3.f34849d;
                if (y41Var3.f34848c) {
                    d = 17.0d;
                    if (d9 <= -1.0d) {
                        d8 = d;
                    } else {
                        if (d9 < 0.0d) {
                            double d10 = (d9 - (-1.0d)) / 1.0d;
                            d5 = (1.0d - d10) * 17.0d;
                            d6 = d10 * 17.0d;
                        } else if (d9 < 0.5d) {
                            double d11 = (d9 - 0.0d) / 0.5d;
                            d5 = (1.0d - d11) * 17.0d;
                            d6 = d11 * 21.0d;
                        } else if (d9 < 1.0d) {
                            double d12 = (d9 - 0.5d) / 0.5d;
                            d5 = (1.0d - d12) * 21.0d;
                            d6 = d12 * 25.0d;
                        }
                        d8 = d6 + d5;
                    }
                } else {
                    d = 92.0d;
                    if (d9 > -1.0d) {
                        if (d9 < 0.0d) {
                            d2 = (d9 - (-1.0d)) / 1.0d;
                            d3 = (1.0d - d2) * 92.0d;
                        } else {
                            if (d9 < 0.5d) {
                                double d13 = (d9 - 0.0d) / 0.5d;
                                d3 = (1.0d - d13) * 92.0d;
                                d4 = d13 * 88.0d;
                            } else {
                                d = 85.0d;
                                if (d9 < 1.0d) {
                                    d2 = (d9 - 0.5d) / 0.5d;
                                    d3 = (1.0d - d2) * 88.0d;
                                } else {
                                    d8 = d;
                                }
                            }
                            d8 = d4 + d3;
                        }
                        d4 = d2 * d;
                        d8 = d4 + d3;
                    } else {
                        d8 = d;
                    }
                }
                return Double.valueOf(d8);
        }
    }
}
