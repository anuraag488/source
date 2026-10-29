package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vc0 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f32517a;

    public /* synthetic */ vc0(byte b) {
        this.f32517a = b;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01cd A[PHI: r11
  0x01cd: PHI (r11v4 double) = (r11v3 double), (r11v3 double), (r11v5 double) binds: [B:91:0x0166, B:94:0x0180, B:174:0x01cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:157:0x0284  */
    @Override // p000.yp1
    public final Object invoke(Object obj) {
        double d;
        double d2;
        double d3;
        double d4;
        byte b = this.f32517a;
        double d5 = 80.0d;
        double d6 = 30.0d;
        double d7 = 20.0d;
        double d8 = 1.0d;
        dd0 dd0Var = jq2.f22514a;
        switch (b) {
            case 0:
                return Double.valueOf(((y41) obj).f34848c ? 40.0d : 80.0d);
            case 1:
                return dd0Var.mo4466m();
            case 2:
                return new bn0(3.0d, 4.5d, 7.0d, 7.0d);
            case 3:
                return ((y41) obj).f34851f;
            case 4:
                return ((y41) obj).f34853h;
            case 5:
                y41 y41Var = (y41) obj;
                pw4 pw4Var = y41Var.f34847b;
                pw4 pw4Var2 = pw4.f28051a;
                boolean z = y41Var.f34848c;
                if (pw4Var == pw4Var2) {
                    if (z) {
                        d7 = 10.0d;
                    } else {
                        d7 = 100.0d;
                    }
                } else if (!z) {
                    d7 = 100.0d;
                }
                return Double.valueOf(d7);
            case 6:
                return dd0Var.mo4471s();
            case 7:
                return new bn0(4.5d, 7.0d, 11.0d, 21.0d);
            case 8:
                return ((y41) obj).f34853h;
            case 9:
                y41 y41Var2 = (y41) obj;
                double d9 = y41Var2.f34849d;
                if (y41Var2.f34848c) {
                    d5 = 22.0d;
                    if (d9 > -1.0d) {
                        if (d9 < 0.0d) {
                            double d10 = (d9 - (-1.0d)) / 1.0d;
                            d3 = (1.0d - d10) * 22.0d;
                            d4 = d10 * 22.0d;
                        } else if (d9 < 0.5d) {
                            double d11 = (d9 - 0.0d) / 0.5d;
                            d3 = (1.0d - d11) * 22.0d;
                            d4 = d11 * 26.0d;
                        } else if (d9 < 1.0d) {
                            double d12 = (d9 - 0.5d) / 0.5d;
                            d3 = (1.0d - d12) * 26.0d;
                            d4 = d12 * 30.0d;
                        }
                        d6 = d4 + d3;
                    }
                    return Double.valueOf(d6);
                }
                if (d9 <= -1.0d) {
                    d5 = 90.0d;
                } else {
                    if (d9 < 0.0d) {
                        double d13 = (d9 - (-1.0d)) / 1.0d;
                        d = (1.0d - d13) * 90.0d;
                        d2 = d13 * 90.0d;
                    } else if (d9 < 0.5d) {
                        double d14 = (d9 - 0.0d) / 0.5d;
                        d = (1.0d - d14) * 90.0d;
                        d2 = d14 * 84.0d;
                    } else if (d9 < 1.0d) {
                        double d15 = (d9 - 0.5d) / 0.5d;
                        d = (1.0d - d15) * 84.0d;
                        d2 = d15 * 80.0d;
                    }
                    d5 = d2 + d;
                }
                d6 = d5;
                return Double.valueOf(d6);
            case 10:
                return ((y41) obj).f34851f;
            case 11:
                y41 y41Var3 = (y41) obj;
                boolean z2 = y41Var3.f34848c;
                double d16 = z2 ? 30.0d : 90.0d;
                if (y41Var3.f34847b == pw4.f28051a) {
                    if (!z2) {
                        d6 = 85.0d;
                    }
                } else if (wc0.m12212n(y41Var3)) {
                    on4 on4Var = y41Var3.f34851f;
                    double d17 = on4Var.f26915a;
                    double d18 = on4Var.f26916b;
                    rv1 rv1Var = new rv1(AbstractC1356y5.m12899H(d17, d18, d16));
                    double d19 = rv1Var.f29662c;
                    if (d19 < d18) {
                        double dMax = d19;
                        while (true) {
                            double d20 = rv1Var.f29662c;
                            if (d20 < d18) {
                                double d21 = d16 + (!z2 ? -1.0d : 1.0d);
                                rv1 rv1Var2 = new rv1(AbstractC1356y5.m12899H(d17, d18, d21));
                                double d22 = rv1Var2.f29662c;
                                if (dMax <= d22) {
                                    double d23 = d22 - d18;
                                    if (Math.abs(d23) >= 0.4d) {
                                        if (Math.abs(d23) < Math.abs(d20 - d18)) {
                                            rv1Var = rv1Var2;
                                        }
                                        dMax = Math.max(dMax, d22);
                                        d16 = d21;
                                    }
                                }
                                d6 = d21;
                            } else {
                                d6 = d16;
                            }
                        }
                    } else {
                        d6 = d16;
                    }
                } else {
                    d6 = d16;
                }
                return Double.valueOf(d6);
            case 12:
                return new bn0(1.0d, 1.0d, 3.0d, 4.5d);
            case 13:
                return ((y41) obj).f34853h;
            case 14:
                return Double.valueOf(((y41) obj).f34848c ? 90.0d : 20.0d);
            case 15:
                return ((y41) obj).f34856k;
            case 16:
                y41 y41Var4 = (y41) obj;
                if (y41Var4.f34855j != x41.f33974c || y41Var4.f34849d <= 0.0d) {
                    return null;
                }
                return f70.m5599u(1.5d);
            case 17:
                return ((y41) obj).f34852g;
            case 18:
                return ((y41) obj).f34855j == x41.f33974c ? dd0Var.mo4477y() : dd0Var.m4454J();
            case 19:
                return ((y41) obj).f34855j == x41.f33974c ? f70.m5599u(6.0d) : f70.m5599u(7.0d);
            case 20:
                return ((y41) obj).f34850e;
            case 21:
                return dd0Var.mo4468p();
            case 22:
                return ((y41) obj).f34855j == x41.f33974c ? f70.m5599u(6.0d) : f70.m5599u(7.0d);
            case 23:
                return ((y41) obj).f34850e;
            case 24:
                return dd0Var.mo4470r();
            case 25:
                return f70.m5599u(4.5d);
            case 26:
                return ((y41) obj).f34852g;
            case 27:
                return ((y41) obj).f34853h;
            case 28:
                y41 y41Var5 = (y41) obj;
                if (y41Var5.f34855j != x41.f33974c) {
                    return Double.valueOf(1.0d);
                }
                pw4 pw4Var3 = y41Var5.f34847b;
                if (pw4Var3 == pw4.f28052b) {
                    d8 = 2.2d;
                } else if (pw4Var3 == pw4.f28053c) {
                    d8 = 1.7d;
                } else if (pw4Var3 == pw4.f28055e) {
                    if (y41Var5.f34853h.f26917c.m10469b()) {
                        d8 = y41Var5.f34848c ? 3.0d : 2.3d;
                    } else {
                        d8 = 1.6d;
                    }
                }
                return Double.valueOf(d8);
            default:
                y41 y41Var6 = (y41) obj;
                if (y41Var6.f34855j == x41.f33974c) {
                    return y41Var6.f34848c ? dd0Var.mo4475w() : dd0Var.mo4476x();
                }
                return dd0Var.m4452H();
        }
    }
}
