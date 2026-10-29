package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cd0 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f15937a;

    public /* synthetic */ cd0(byte b) {
        this.f15937a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        double d;
        double dM5594A;
        double d2;
        double dM5594A2;
        byte b = this.f15937a;
        double d3 = 95.0d;
        dd0 dd0Var = jq2.f22514a;
        double dM5604z = 90.0d;
        switch (b) {
            case 0:
                y41 y41Var = (y41) obj;
                pw4 pw4Var = y41Var.f34847b;
                if (pw4Var == pw4.f28052b) {
                    return Double.valueOf(2.2d);
                }
                if (pw4Var == pw4.f28053c) {
                    return Double.valueOf(1.7d);
                }
                if (pw4Var == pw4.f28055e) {
                    return y41Var.f34853h.f26917c.m10469b() ? Double.valueOf(2.3d) : Double.valueOf(1.6d);
                }
                return pw4Var == pw4.f28054d ? Double.valueOf(1.29d) : Double.valueOf(1.0d);
            case 1:
                y41 y41Var2 = (y41) obj;
                on4 on4Var = y41Var2.f34851f;
                boolean z = y41Var2.f34848c;
                x41 x41Var = y41Var2.f34855j;
                x41 x41Var2 = x41.f33975d;
                pw4 pw4Var2 = y41Var2.f34847b;
                if (x41Var == x41Var2) {
                    if (pw4Var2 != pw4.f28052b) {
                        dM5604z = f70.m5594A(on4Var, 0.0d, 90.0d);
                    }
                } else if (pw4Var2 == pw4.f28052b) {
                    dM5604z = z ? f70.m5595B(on4Var, 0.0d, 98.0d) : f70.m5604z(on4Var);
                } else if (pw4Var2 == pw4.f28054d) {
                    dM5604z = f70.m5594A(on4Var, 0.0d, z ? 90 : 98);
                } else {
                    dM5604z = z ? 80.0d : f70.m5604z(on4Var);
                }
                return Double.valueOf(dM5604z);
            case 2:
                return ((y41) obj).f34850e;
            case 3:
                return dd0Var.mo4470r();
            case 4:
                return f70.m5599u(7.0d);
            case 5:
                return ((y41) obj).f34853h;
            case 6:
                y41 y41Var3 = (y41) obj;
                if (y41Var3.f34855j != x41.f33974c) {
                    d3 = 15.0d;
                } else if (y41Var3.f34848c) {
                    d3 = 6.0d;
                } else if (y41Var3.f34853h.f26917c.m10469b()) {
                    d3 = 98.0d;
                } else if (y41Var3.f34847b != pw4.f28054d) {
                    d3 = 96.0d;
                }
                return Double.valueOf(d3);
            case 7:
                y41 y41Var4 = (y41) obj;
                Double dValueOf = Double.valueOf(1.3d);
                if (y41Var4.f34855j == x41.f33974c) {
                    pw4 pw4Var3 = y41Var4.f34847b;
                    if (pw4Var3 == pw4.f28052b) {
                        return dValueOf;
                    }
                    if (pw4Var3 == pw4.f28053c) {
                        return Double.valueOf(1.25d);
                    }
                    if (pw4Var3 == pw4.f28055e) {
                        return y41Var4.f34853h.f26917c.m10469b() ? dValueOf : Double.valueOf(1.15d);
                    }
                    if (pw4Var3 == pw4.f28054d) {
                        return Double.valueOf(1.08d);
                    }
                }
                return Double.valueOf(1.0d);
            case 8:
                return ((y41) obj).f34853h;
            case 9:
                return Double.valueOf(((y41) obj).f34848c ? 98.0d : 4.0d);
            case 10:
                return ((y41) obj).f34853h;
            case 11:
                y41 y41Var5 = (y41) obj;
                if (y41Var5.f34855j != x41.f33974c) {
                    d = 25.0d;
                } else if (y41Var5.f34848c) {
                    d = 12.0d;
                } else if (y41Var5.f34853h.f26917c.m10469b()) {
                    d = 94.0d;
                } else {
                    d = y41Var5.f34847b == pw4.f28054d ? 90.0d : 92.0d;
                }
                return Double.valueOf(d);
            case 12:
                y41 y41Var6 = (y41) obj;
                if (y41Var6.f34855j == x41.f33974c) {
                    pw4 pw4Var4 = y41Var6.f34847b;
                    if (pw4Var4 == pw4.f28052b) {
                        return Double.valueOf(1.9d);
                    }
                    if (pw4Var4 == pw4.f28053c) {
                        return Double.valueOf(1.5d);
                    }
                    if (pw4Var4 == pw4.f28055e) {
                        return y41Var6.f34853h.f26917c.m10469b() ? Double.valueOf(1.95d) : Double.valueOf(1.45d);
                    }
                    if (pw4Var4 == pw4.f28054d) {
                        return Double.valueOf(1.22d);
                    }
                }
                return Double.valueOf(1.0d);
            case 13:
                return ((y41) obj).f34851f;
            case 14:
                return dd0Var.mo4474v();
            case 15:
                return f70.m5599u(4.5d);
            case 16:
                return ((y41) obj).f34856k;
            case 17:
                return dd0Var.mo4457c();
            case 18:
                return ((y41) obj).f34855j == x41.f33974c ? f70.m5599u(4.5d) : f70.m5599u(7.0d);
            case 19:
                return ((y41) obj).f34851f;
            case 20:
                y41 y41Var7 = (y41) obj;
                on4 on4Var2 = y41Var7.f34851f;
                boolean z2 = y41Var7.f34848c;
                if (y41Var7.f34855j == x41.f33975d) {
                    dM5594A = 30.0d;
                } else {
                    pw4 pw4Var5 = y41Var7.f34847b;
                    if (pw4Var5 == pw4.f28054d) {
                        dM5594A = z2 ? f70.m5595B(on4Var2, 30.0d, 40.0d) : f70.m5594A(on4Var2, 84.0d, 90.0d);
                    } else if (pw4Var5 == pw4.f28055e) {
                        dM5594A = z2 ? 15.0d : f70.m5594A(on4Var2, 90.0d, 95.0d);
                    } else {
                        dM5594A = z2 ? 25.0d : 90.0d;
                    }
                }
                return Double.valueOf(dM5594A);
            case 21:
                return ((y41) obj).f34855j == x41.f33974c ? f70.m5599u(4.5d) : f70.m5599u(7.0d);
            case 22:
                y41 y41Var8 = (y41) obj;
                if (y41Var8.f34855j != x41.f33974c || y41Var8.f34849d <= 0.0d) {
                    return null;
                }
                return f70.m5599u(1.5d);
            case 23:
                return ((y41) obj).f34853h;
            case 24:
                y41 y41Var9 = (y41) obj;
                if (y41Var9.f34855j != x41.f33974c) {
                    return Double.valueOf(1.0d);
                }
                pw4 pw4Var6 = y41Var9.f34847b;
                if (pw4Var6 == pw4.f28052b) {
                    d2 = 2.2d;
                } else if (pw4Var6 == pw4.f28053c) {
                    d2 = 1.7d;
                } else if (pw4Var6 != pw4.f28055e) {
                    d2 = 1.0d;
                } else if (y41Var9.f34853h.f26917c.m10469b()) {
                    d2 = y41Var9.f34848c ? 3.0d : 2.3d;
                } else {
                    d2 = 1.6d;
                }
                return Double.valueOf(d2);
            case 25:
                y41 y41Var10 = (y41) obj;
                if (y41Var10.f34855j == x41.f33974c) {
                    return y41Var10.f34848c ? dd0Var.mo4475w() : dd0Var.mo4476x();
                }
                return dd0Var.m4452H();
            case 26:
                return ((y41) obj).f34855j == x41.f33974c ? f70.m5599u(3.0d) : f70.m5599u(4.5d);
            case 27:
                return ((y41) obj).f34852g;
            case 28:
                y41 y41Var11 = (y41) obj;
                on4 on4Var3 = y41Var11.f34852g;
                boolean z3 = y41Var11.f34848c;
                x41 x41Var3 = y41Var11.f34855j;
                x41 x41Var4 = x41.f33975d;
                pw4 pw4Var7 = y41Var11.f34847b;
                if (x41Var3 == x41Var4) {
                    dM5594A2 = pw4Var7 == pw4.f28053c ? f70.m5594A(on4Var3, 0.0d, 90.0d) : f70.m5604z(on4Var3);
                } else if (pw4Var7 == pw4.f28052b) {
                    dM5594A2 = z3 ? f70.m5594A(on4Var3, 0.0d, 93.0d) : f70.m5594A(on4Var3, 0.0d, 96.0d);
                } else {
                    int i = 100;
                    if (pw4Var7 == pw4.f28053c) {
                        dM5594A2 = f70.m5594A(on4Var3, 0.0d, z3 ? 93 : 100);
                    } else if (pw4Var7 == pw4.f28055e) {
                        if (on4Var3.f26917c.m10468a()) {
                            i = 88;
                        } else if (z3) {
                            i = 93;
                        }
                        dM5594A2 = f70.m5594A(on4Var3, 75.0d, i);
                    } else {
                        dM5594A2 = z3 ? f70.m5594A(on4Var3, 0.0d, 93.0d) : f70.m5594A(on4Var3, 72.0d, 100.0d);
                    }
                }
                return Double.valueOf(dM5594A2);
            default:
                return kt2.f23428a;
        }
    }
}
