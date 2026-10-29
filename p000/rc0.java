package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rc0 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f29147a;

    public /* synthetic */ rc0(byte b) {
        this.f29147a = b;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a4  */
    @Override // p000.yp1
    public final Object invoke(Object obj) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        double d9;
        byte b = this.f29147a;
        double d10 = 40.0d;
        double d11 = 98.0d;
        double d12 = 10.0d;
        double dM76n = 100.0d;
        double d13 = 30.0d;
        dd0 dd0Var = jq2.f22514a;
        switch (b) {
            case 0:
                return new bn0(1.0d, 1.0d, 3.0d, 4.5d);
            case 1:
                y41 y41Var = (y41) obj;
                if (wc0.m12212n(y41Var)) {
                    d13 = y41Var.f34846a.f29663d;
                } else {
                    pw4 pw4Var = y41Var.f34847b;
                    pw4 pw4Var2 = pw4.f28051a;
                    boolean z = y41Var.f34848c;
                    if (pw4Var == pw4Var2) {
                        d13 = z ? 85.0d : 25.0d;
                    } else if (!z) {
                        d13 = 90.0d;
                    }
                }
                return Double.valueOf(d13);
            case 2:
                return ((y41) obj).f34850e;
            case 3:
                y41 y41Var2 = (y41) obj;
                pw4 pw4Var3 = y41Var2.f34847b;
                pw4 pw4Var4 = pw4.f28051a;
                boolean z2 = y41Var2.f34848c;
                if (pw4Var3 == pw4Var4) {
                    d10 = z2 ? 100.0d : 0.0d;
                } else if (z2) {
                    d10 = 80.0d;
                }
                return Double.valueOf(d10);
            case 4:
                return new bn0(3.0d, 4.5d, 7.0d, 7.0d);
            case 5:
                return ((y41) obj).f34853h;
            case 6:
                y41 y41Var3 = (y41) obj;
                double d14 = y41Var3.f34849d;
                if (y41Var3.f34848c) {
                    if (d14 > -1.0d) {
                        if (d14 < 0.0d) {
                            d4 = (d14 - (-1.0d)) / 1.0d;
                            d5 = (1.0d - d4) * 10.0d;
                        } else if (d14 < 0.5d) {
                            double d15 = (d14 - 0.0d) / 0.5d;
                            d5 = (1.0d - d15) * 10.0d;
                            d6 = d15 * 11.0d;
                            d12 = d6 + d5;
                        } else {
                            d12 = 12.0d;
                            if (d14 < 1.0d) {
                                d4 = (d14 - 0.5d) / 0.5d;
                                d5 = (1.0d - d4) * 11.0d;
                            }
                        }
                        d6 = d4 * d12;
                        d12 = d6 + d5;
                    }
                } else if (d14 <= -1.0d) {
                    d12 = 96.0d;
                } else {
                    if (d14 < 0.0d) {
                        d3 = (d14 - (-1.0d)) / 1.0d;
                    } else if (d14 < 0.5d) {
                        d3 = (d14 - 0.0d) / 0.5d;
                    } else if (d14 < 1.0d) {
                        double d16 = (d14 - 0.5d) / 0.5d;
                        d = (1.0d - d16) * 96.0d;
                        d2 = d16 * 95.0d;
                        d12 = d2 + d;
                    } else {
                        d12 = 95.0d;
                    }
                    d = (1.0d - d3) * 96.0d;
                    d2 = d3 * 96.0d;
                    d12 = d2 + d;
                }
                return Double.valueOf(d12);
            case 7:
                return ((y41) obj).f34853h;
            case 8:
                return Double.valueOf(((y41) obj).f34848c ? 6.0d : 98.0d);
            case 9:
                return ((y41) obj).f34850e;
            case 10:
                return Double.valueOf(((y41) obj).f34847b != pw4.f28051a ? 90.0d : 40.0d);
            case 11:
                return new bn0(1.0d, 1.0d, 3.0d, 4.5d);
            case 12:
                return new bn0(1.0d, 1.0d, 3.0d, 4.5d);
            case 13:
                return ((y41) obj).f34852g;
            case 14:
                return Double.valueOf(((y41) obj).f34847b == pw4.f28051a ? 90.0d : 30.0d);
            case 15:
                return dd0Var.mo4446B();
            case 16:
                return dd0Var.mo4445A();
            case 17:
                return new bn0(3.0d, 4.5d, 7.0d, 11.0d);
            case 18:
                return ((y41) obj).f34852g;
            case 19:
                y41 y41Var4 = (y41) obj;
                boolean z3 = y41Var4.f34848c;
                if (y41Var4.f34847b == pw4.f28051a) {
                    if (z3) {
                        dM76n = 0.0d;
                    }
                } else if (wc0.m12212n(y41Var4)) {
                    dM76n = C0006a5.m76n(((Number) dd0Var.mo4478z().f26322c.invoke(y41Var4)).doubleValue(), 4.5d);
                } else {
                    dM76n = z3 ? 90.0d : 30.0d;
                }
                return Double.valueOf(dM76n);
            case 20:
                return dd0Var.mo4478z();
            case 21:
                return new bn0(3.0d, 4.5d, 7.0d, 11.0d);
            case 22:
                return ((y41) obj).f34856k;
            case 23:
                y41 y41Var5 = (y41) obj;
                pw4 pw4Var5 = y41Var5.f34847b;
                pw4 pw4Var6 = pw4.f28051a;
                boolean z4 = y41Var5.f34848c;
                if (pw4Var5 == pw4Var6) {
                    if (z4) {
                        d12 = 90.0d;
                    }
                } else if (z4) {
                    d12 = 90.0d;
                } else {
                    d12 = 30.0d;
                }
                return Double.valueOf(d12);
            case 24:
                return dd0Var.mo4457c();
            case 25:
                return new bn0(3.0d, 4.5d, 7.0d, 11.0d);
            case 26:
                return ((y41) obj).f34853h;
            case 27:
                y41 y41Var6 = (y41) obj;
                if (y41Var6.f34848c) {
                    double d17 = y41Var6.f34849d;
                    d11 = 24.0d;
                    if (d17 > -1.0d) {
                        if (d17 < 0.0d) {
                            d7 = (d17 - (-1.0d)) / 1.0d;
                            d8 = (1.0d - d7) * 24.0d;
                        } else if (d17 < 0.5d) {
                            double d18 = (d17 - 0.0d) / 0.5d;
                            d8 = (1.0d - d18) * 24.0d;
                            d9 = d18 * 29.0d;
                            d11 = d9 + d8;
                        } else {
                            d11 = 34.0d;
                            if (d17 < 1.0d) {
                                d7 = (d17 - 0.5d) / 0.5d;
                                d8 = (1.0d - d7) * 29.0d;
                            }
                        }
                        d9 = d7 * d11;
                        d11 = d9 + d8;
                    }
                }
                return Double.valueOf(d11);
            case 28:
                return ((y41) obj).f34852g;
            default:
                return Double.valueOf(((y41) obj).f34847b == pw4.f28051a ? 100.0d : 10.0d);
        }
    }
}
