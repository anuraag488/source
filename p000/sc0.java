package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sc0 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f30157a;

    public /* synthetic */ sc0(byte b) {
        this.f30157a = b;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003b A[PHI: r3
  0x003b: PHI (r3v11 double) = (r3v8 double), (r3v9 double) binds: [B:10:0x0039, B:21:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.yp1
    public final Object invoke(Object obj) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        byte b = this.f30157a;
        double d7 = 10.0d;
        double d8 = 90.0d;
        double d9 = 100.0d;
        dd0 dd0Var = jq2.f22514a;
        switch (b) {
            case 0:
                return dd0Var.mo4446B();
            case 1:
                return ((y41) obj).f34851f;
            case 2:
                return dd0Var.mo4445A();
            case 3:
                return new bn0(4.5d, 7.0d, 11.0d, 21.0d);
            case 4:
                return ((y41) obj).f34852g;
            case 5:
                y41 y41Var = (y41) obj;
                pw4 pw4Var = y41Var.f34847b;
                pw4 pw4Var2 = pw4.f28051a;
                boolean z = y41Var.f34848c;
                if (pw4Var != pw4Var2) {
                    d7 = z ? 20.0d : 100.0d;
                } else if (!z) {
                    d7 = 90.0d;
                }
                return Double.valueOf(d7);
            case 6:
                return dd0Var.mo4477y();
            case 7:
                return new bn0(4.5d, 7.0d, 11.0d, 21.0d);
            case 8:
                return ((y41) obj).f34854i;
            case 9:
                return Double.valueOf(((y41) obj).f34848c ? 80.0d : 30.0d);
            case 10:
                return new bn0(3.0d, 4.5d, 7.0d, 11.0d);
            case 11:
                return ((y41) obj).f34850e;
            case 12:
                return Double.valueOf(((y41) obj).f34848c ? 80.0d : 40.0d);
            case 13:
                return Double.valueOf(((y41) obj).f34847b == pw4.f28051a ? 100.0d : 10.0d);
            case 14:
                return dd0Var.mo4470r();
            case 15:
                return dd0Var.mo4469q();
            case 16:
                return new bn0(4.5d, 7.0d, 11.0d, 21.0d);
            case 17:
                return ((y41) obj).f34852g;
            case 18:
                y41 y41Var2 = (y41) obj;
                boolean z2 = y41Var2.f34848c;
                if (y41Var2.f34847b == pw4.f28051a) {
                    d8 = z2 ? 60.0d : 49.0d;
                } else if (wc0.m12212n(y41Var2)) {
                    d8 = c20.m3819n(y41Var2.f34852g.m9191a(y41Var2.f34846a.f29663d)).f29663d;
                } else if (z2) {
                    d8 = 30.0d;
                }
                return Double.valueOf(d8);
            case 19:
                return new bn0(1.0d, 1.0d, 3.0d, 4.5d);
            case 20:
                return new bn0(3.0d, 4.5d, 7.0d, 7.0d);
            case 21:
                return ((y41) obj).f34854i;
            case 22:
                return Double.valueOf(((y41) obj).f34848c ? 30.0d : 80.0d);
            case 23:
                return Double.valueOf(0.0d);
            case 24:
                return new bn0(1.0d, 1.0d, 3.0d, 4.5d);
            case 25:
                return ((y41) obj).f34853h;
            case 26:
                y41 y41Var3 = (y41) obj;
                if (y41Var3.f34848c) {
                    double d10 = y41Var3.f34849d;
                    if (d10 <= -1.0d) {
                        d9 = 4.0d;
                    } else {
                        if (d10 < 0.0d) {
                            double d11 = (d10 - (-1.0d)) / 1.0d;
                            d = (1.0d - d11) * 4.0d;
                            d2 = d11 * 4.0d;
                        } else if (d10 < 0.5d) {
                            double d12 = (d10 - 0.0d) / 0.5d;
                            d = (1.0d - d12) * 4.0d;
                            d2 = d12 * 2.0d;
                        } else if (d10 < 1.0d) {
                            double d13 = (d10 - 0.5d) / 0.5d;
                            d = (1.0d - d13) * 2.0d;
                            d2 = d13 * 0.0d;
                        } else {
                            d9 = 0.0d;
                        }
                        d9 = d2 + d;
                    }
                }
                return Double.valueOf(d9);
            case 27:
                return ((y41) obj).f34853h;
            case 28:
                y41 y41Var4 = (y41) obj;
                if (y41Var4.f34848c) {
                    d6 = 6.0d;
                } else {
                    double d14 = y41Var4.f34849d;
                    double d15 = 87.0d;
                    if (d14 > -1.0d) {
                        if (d14 < 0.0d) {
                            d3 = (d14 - (-1.0d)) / 1.0d;
                            d4 = (1.0d - d3) * 87.0d;
                        } else {
                            if (d14 < 0.5d) {
                                double d16 = (d14 - 0.0d) / 0.5d;
                                d4 = (1.0d - d16) * 87.0d;
                                d5 = d16 * 80.0d;
                            } else {
                                d15 = 75.0d;
                                if (d14 < 1.0d) {
                                    d3 = (d14 - 0.5d) / 0.5d;
                                    d4 = (1.0d - d3) * 80.0d;
                                } else {
                                    d6 = d15;
                                }
                            }
                            d6 = d5 + d4;
                        }
                        d5 = d3 * d15;
                        d6 = d5 + d4;
                    } else {
                        d6 = d15;
                    }
                }
                return Double.valueOf(d6);
            default:
                return ((y41) obj).f34856k;
        }
    }
}
