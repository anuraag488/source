package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class wc0 {
    /* JADX INFO: renamed from: n */
    public static boolean m12212n(y41 y41Var) {
        pw4 pw4Var = y41Var.f34847b;
        return pw4Var == pw4.f28056f || pw4Var == pw4.f28057g;
    }

    /* JADX INFO: renamed from: A */
    public o41 mo4445A() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "tertiary_fixed";
        mq4Var.f25142c = new C0499bp((byte) 28);
        mq4Var.f25143d = new C0499bp((byte) 29);
        mq4Var.f25140a = true;
        mq4Var.f25145f = new C0633f0(1, this, wc0.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, (byte) 19);
        mq4Var.f25147h = new rc0((byte) 0);
        qc0 qc0Var = new qc0((byte) 1);
        qc0Var.f28372b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25148i = qc0Var;
        return mq4Var.m8369a();
    }

    /* JADX INFO: renamed from: B */
    public o41 mo4446B() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "tertiary_fixed_dim";
        mq4Var.f25142c = new C0499bp((byte) 14);
        mq4Var.f25143d = new C0499bp((byte) 15);
        mq4Var.f25140a = true;
        mq4Var.f25145f = new C0633f0(1, this, wc0.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, (byte) 20);
        mq4Var.f25147h = new C0499bp((byte) 16);
        qc0 qc0Var = new qc0((byte) 0);
        qc0Var.f28372b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25148i = qc0Var;
        return mq4Var.m8369a();
    }

    /* JADX INFO: renamed from: a */
    public o41 mo4455a() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "background";
        mq4Var.f25142c = new tc0((byte) 3);
        mq4Var.f25143d = new tc0((byte) 14);
        mq4Var.f25140a = true;
        return mq4Var.m8369a();
    }

    /* JADX INFO: renamed from: b */
    public o41 mo4456b() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "error";
        mq4Var.f25142c = new sc0((byte) 29);
        mq4Var.f25143d = new tc0((byte) 0);
        mq4Var.f25140a = true;
        mq4Var.f25145f = new C0633f0(1, this, wc0.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, (byte) 3);
        mq4Var.f25147h = new tc0((byte) 1);
        qc0 qc0Var = new qc0((byte) 7);
        qc0Var.f28372b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25148i = qc0Var;
        return mq4Var.m8369a();
    }

    /* JADX INFO: renamed from: c */
    public o41 mo4457c() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "error_container";
        mq4Var.f25142c = new tc0((byte) 16);
        mq4Var.f25143d = new tc0((byte) 17);
        mq4Var.f25140a = true;
        mq4Var.f25145f = new C0633f0(1, this, wc0.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, (byte) 4);
        mq4Var.f25147h = new tc0((byte) 18);
        qc0 qc0Var = new qc0((byte) 9);
        qc0Var.f28372b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25148i = qc0Var;
        return mq4Var.m8369a();
    }

    /* JADX INFO: renamed from: d */
    public on4 mo4458d(pw4 pw4Var, rv1 rv1Var, boolean z, x41 x41Var, double d) {
        switch (pw4Var.ordinal()) {
            default:
                C0670g.m5864c();
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public rv1 mo4459e(o41 o41Var, y41 y41Var) {
        return ((on4) o41Var.f26321b.invoke(y41Var)).m9191a(mo4465k(o41Var, y41Var));
    }

    /* JADX INFO: renamed from: f */
    public on4 mo4460f(pw4 pw4Var, rv1 rv1Var, boolean z, x41 x41Var, double d) {
        double d2 = rv1Var.f29661b;
        switch (pw4Var.ordinal()) {
            case 0:
                return mn4.m8363a(d2, 0.0d);
            case 1:
                return mn4.m8363a(d2, 2.0d);
            case 2:
                return mn4.m8363a(d2, 6.0d);
            case 3:
                return mn4.m8363a(d2, 10.0d);
            case 4:
                double d3 = (d2 + 15.0d) % 360.0d;
                if (d3 < 0.0d) {
                    d3 += 360.0d;
                }
                return mn4.m8363a(d3, 8.0d);
            case 5:
            case 6:
                return mn4.m8363a(d2, rv1Var.f29662c / 8.0d);
            case 7:
                return mn4.m8363a(d2, 0.0d);
            case 8:
                return mn4.m8363a(d2, 10.0d);
            default:
                C0670g.m5864c();
                return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public on4 mo4461g(pw4 pw4Var, rv1 rv1Var, boolean z, x41 x41Var, double d) {
        double d2 = rv1Var.f29662c;
        double d3 = rv1Var.f29661b;
        switch (pw4Var.ordinal()) {
            case 0:
                return mn4.m8363a(d3, 0.0d);
            case 1:
                return mn4.m8363a(d3, 2.0d);
            case 2:
                return mn4.m8363a(d3, 8.0d);
            case 3:
                return mn4.m8363a(d3, 12.0d);
            case 4:
                double d4 = (d3 + 15.0d) % 360.0d;
                if (d4 < 0.0d) {
                    d4 += 360.0d;
                }
                return mn4.m8363a(d4, 12.0d);
            case 5:
                return mn4.m8363a(d3, (d2 / 8.0d) + 4.0d);
            case 6:
                return mn4.m8363a(d3, (d2 / 8.0d) + 4.0d);
            case 7:
                return mn4.m8363a(d3, 0.0d);
            case 8:
                return mn4.m8363a(d3, 16.0d);
            default:
                C0670g.m5864c();
                return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public on4 mo4462h(pw4 pw4Var, rv1 rv1Var, boolean z, x41 x41Var, double d) {
        double d2 = rv1Var.f29661b;
        switch (pw4Var.ordinal()) {
            case 0:
                return mn4.m8363a(d2, 0.0d);
            case 1:
                return mn4.m8363a(d2, 12.0d);
            case 2:
                return mn4.m8363a(d2, 36.0d);
            case 3:
                return mn4.m8363a(d2, 200.0d);
            case 4:
                double d3 = (d2 + 240.0d) % 360.0d;
                if (d3 < 0.0d) {
                    d3 += 360.0d;
                }
                return mn4.m8363a(d3, 40.0d);
            case 5:
            case 6:
                return mn4.m8363a(d2, rv1Var.f29662c);
            case 7:
                return mn4.m8363a(d2, 48.0d);
            case 8:
                double d4 = (d2 - 50.0d) % 360.0d;
                if (d4 < 0.0d) {
                    d4 += 360.0d;
                }
                return mn4.m8363a(d4, 48.0d);
            default:
                C0670g.m5864c();
                return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public on4 mo4463i(pw4 pw4Var, rv1 rv1Var, boolean z, x41 x41Var, double d) {
        double d2 = rv1Var.f29661b;
        switch (pw4Var.ordinal()) {
            case 0:
                return mn4.m8363a(d2, 0.0d);
            case 1:
                return mn4.m8363a(d2, 8.0d);
            case 2:
                return mn4.m8363a(d2, 16.0d);
            case 3:
                return mn4.m8363a(C0638f5.m5552w(rv1Var, new double[]{0.0d, 41.0d, 61.0d, 101.0d, 131.0d, 181.0d, 251.0d, 301.0d, 360.0d}, new double[]{18.0d, 15.0d, 10.0d, 12.0d, 15.0d, 18.0d, 15.0d, 12.0d, 12.0d}), 24.0d);
            case 4:
                return mn4.m8363a(C0638f5.m5552w(rv1Var, new double[]{0.0d, 21.0d, 51.0d, 121.0d, 151.0d, 191.0d, 271.0d, 321.0d, 360.0d}, new double[]{45.0d, 95.0d, 45.0d, 20.0d, 45.0d, 90.0d, 45.0d, 45.0d, 45.0d}), 24.0d);
            case 5:
            case 6:
                double d3 = rv1Var.f29662c;
                return mn4.m8363a(d2, Math.max(d3 - 32.0d, d3 * 0.5d));
            case 7:
                return mn4.m8363a(d2, 16.0d);
            case 8:
                double d4 = (d2 - 50.0d) % 360.0d;
                if (d4 < 0.0d) {
                    d4 += 360.0d;
                }
                return mn4.m8363a(d4, 36.0d);
            default:
                C0670g.m5864c();
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x023a  */
    /* JADX WARN: Code duplicated, block: B:132:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f2 A[LOOP:5: B:43:0x00f0->B:44:0x00f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:51:0x0112  */
    /* JADX WARN: Code duplicated, block: B:53:0x0115 A[LOOP:7: B:52:0x0113->B:53:0x0115, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x0121  */
    /* JADX INFO: renamed from: j */
    public on4 mo4464j(pw4 pw4Var, rv1 rv1Var, boolean z, x41 x41Var, double d) {
        rv1 rv1Var2;
        double dAbs;
        ArrayList arrayList;
        int i;
        int i2;
        int i3;
        int i4;
        int size;
        int size2;
        double d2 = rv1Var.f29661b;
        boolean z2 = false;
        double d3 = 0.0d;
        switch (pw4Var.ordinal()) {
            case 0:
                return mn4.m8363a(d2, 0.0d);
            case 1:
                return mn4.m8363a(d2, 16.0d);
            case 2:
            case 7:
                double d4 = (d2 + 60.0d) % 360.0d;
                if (d4 < 0.0d) {
                    d4 += 360.0d;
                }
                return mn4.m8363a(d4, 24.0d);
            case 3:
                return mn4.m8363a(C0638f5.m5552w(rv1Var, new double[]{0.0d, 41.0d, 61.0d, 101.0d, 131.0d, 181.0d, 251.0d, 301.0d, 360.0d}, new double[]{35.0d, 30.0d, 20.0d, 25.0d, 30.0d, 35.0d, 30.0d, 25.0d, 25.0d}), 32.0d);
            case 4:
                return mn4.m8363a(C0638f5.m5552w(rv1Var, new double[]{0.0d, 21.0d, 51.0d, 121.0d, 151.0d, 191.0d, 271.0d, 321.0d, 360.0d}, new double[]{120.0d, 120.0d, 20.0d, 45.0d, 20.0d, 15.0d, 20.0d, 120.0d, 120.0d}), 32.0d);
            case 5:
                ui4 ui4Var = new ui4(rv1Var);
                rv1 rv1Var3 = ui4Var.f31897b;
                if (rv1Var3 == null) {
                    double d5 = ((rv1) ui4Var.m11562b().get(0)).f29661b;
                    double dDoubleValue = ((Number) ((HashMap) ui4Var.m11564d()).get((rv1) ui4Var.m11562b().get(0))).doubleValue();
                    double d6 = ui4Var.m11565e().f29661b;
                    double dDoubleValue2 = ((Number) ((HashMap) ui4Var.m11564d()).get(ui4Var.m11565e())).doubleValue() - dDoubleValue;
                    if (d5 >= d6 ? d5 <= d2 || d2 <= d6 : d5 <= d2 && d2 <= d6) {
                        z2 = true;
                    }
                    double d7 = z2 ? d6 : d5;
                    if (!z2) {
                        d5 = d6;
                    }
                    rv1 rv1Var4 = (rv1) ((ArrayList) ui4Var.m11561a()).get((int) Math.rint(d2));
                    double dM11563c = 1.0d - ui4Var.m11563c(rv1Var);
                    double d8 = 1000.0d;
                    double d9 = 0.0d;
                    while (d9 <= 360.0d) {
                        double d10 = ((1.0d * d9) + d7) % 360.0d;
                        if (d10 < d3) {
                            d10 += 360.0d;
                        }
                        if (d7 < d5) {
                            if (d7 > d10 || d10 > d5) {
                                d9 += 1.0d;
                            } else {
                                double d11 = d3;
                                rv1Var2 = (rv1) ((ArrayList) ui4Var.m11561a()).get((int) Math.rint(d10));
                                dAbs = Math.abs(dM11563c - ((((Number) ((HashMap) ui4Var.m11564d()).get(rv1Var2)).doubleValue() - dDoubleValue) / dDoubleValue2));
                                if (dAbs < d8) {
                                    rv1Var4 = rv1Var2;
                                    d8 = dAbs;
                                }
                                d9 += 1.0d;
                                d3 = d11;
                            }
                        } else if (d7 <= d10 || d10 <= d5) {
                            double d12 = d3;
                            rv1Var2 = (rv1) ((ArrayList) ui4Var.m11561a()).get((int) Math.rint(d10));
                            dAbs = Math.abs(dM11563c - ((((Number) ((HashMap) ui4Var.m11564d()).get(rv1Var2)).doubleValue() - dDoubleValue) / dDoubleValue2));
                            if (dAbs < d8) {
                                rv1Var4 = rv1Var2;
                                d8 = dAbs;
                            }
                            d9 += 1.0d;
                            d3 = d12;
                        } else {
                            d9 += 1.0d;
                        }
                    }
                    ui4Var.f31897b = rv1Var4;
                    rv1Var3 = rv1Var4;
                }
                rv1 rv1VarM3819n = c20.m3819n(rv1Var3);
                return new on4(rv1VarM3819n.f29661b, rv1VarM3819n.f29662c, rv1VarM3819n);
            case 6:
                ui4 ui4Var2 = new ui4(rv1Var);
                int iRint = (int) Math.rint(d2);
                rv1 rv1Var5 = (rv1) ((ArrayList) ui4Var2.m11561a()).get(iRint);
                double dM11563c2 = ui4Var2.m11563c(rv1Var5);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(rv1Var5);
                int i5 = 0;
                double dAbs2 = 0.0d;
                while (i5 < 360) {
                    int i6 = (iRint + i5) % 360;
                    if (i6 < 0) {
                        i6 += 360;
                    }
                    double dM11563c3 = ui4Var2.m11563c((rv1) ((ArrayList) ui4Var2.m11561a()).get(i6));
                    dAbs2 += Math.abs(dM11563c3 - dM11563c2);
                    i5++;
                    dM11563c2 = dM11563c3;
                }
                double d13 = dAbs2 / 6.0d;
                double dM11563c4 = ui4Var2.m11563c(rv1Var5);
                int i7 = 1;
                while (arrayList2.size() < 6) {
                    int i8 = (iRint + i7) % 360;
                    if (i8 < 0) {
                        i8 += 360;
                    }
                    rv1 rv1Var6 = (rv1) ((ArrayList) ui4Var2.m11561a()).get(i8);
                    double dM11563c5 = ui4Var2.m11563c(rv1Var6);
                    double dAbs3 = d3 + Math.abs(dM11563c5 - dM11563c4);
                    boolean z3 = dAbs3 >= ((double) arrayList2.size()) * d13;
                    int i9 = 1;
                    while (z3 && arrayList2.size() < 6) {
                        arrayList2.add(rv1Var6);
                        double d14 = dAbs3;
                        z3 = d14 >= ((double) (arrayList2.size() + i9)) * d13;
                        i9++;
                        dAbs3 = d14;
                    }
                    double d15 = dAbs3;
                    i7++;
                    if (i7 > 360) {
                        while (arrayList2.size() < 6) {
                            arrayList2.add(rv1Var6);
                        }
                        arrayList = new ArrayList();
                        arrayList.add(rv1Var);
                        int iFloor = (int) Math.floor(1.0d);
                        i = iFloor + 1;
                        for (i2 = 1; i2 < i; i2++) {
                            size2 = 0 - i2;
                            while (size2 < 0) {
                                size2 += arrayList2.size();
                            }
                            if (size2 >= arrayList2.size()) {
                                size2 %= arrayList2.size();
                            }
                            arrayList.add(0, arrayList2.get(size2));
                        }
                        i3 = 3 - iFloor;
                        for (i4 = 1; i4 < i3; i4++) {
                            size = i4;
                            while (size < 0) {
                                size += arrayList2.size();
                            }
                            if (size >= arrayList2.size()) {
                                size %= arrayList2.size();
                            }
                            arrayList.add(arrayList2.get(size));
                        }
                        rv1 rv1VarM3819n2 = c20.m3819n((rv1) arrayList.get(2));
                        return new on4(rv1VarM3819n2.f29661b, rv1VarM3819n2.f29662c, rv1VarM3819n2);
                    }
                    d3 = d15;
                    dM11563c4 = dM11563c5;
                }
                arrayList = new ArrayList();
                arrayList.add(rv1Var);
                int iFloor2 = (int) Math.floor(1.0d);
                i = iFloor2 + 1;
                while (i2 < i) {
                    size2 = 0 - i2;
                    while (size2 < 0) {
                        size2 += arrayList2.size();
                    }
                    if (size2 >= arrayList2.size()) {
                        size2 %= arrayList2.size();
                    }
                    arrayList.add(0, arrayList2.get(size2));
                }
                i3 = 3 - iFloor2;
                while (i4 < i3) {
                    size = i4;
                    while (size < 0) {
                        size += arrayList2.size();
                    }
                    if (size >= arrayList2.size()) {
                        size %= arrayList2.size();
                    }
                    arrayList.add(arrayList2.get(size));
                }
                rv1 rv1VarM3819n3 = c20.m3819n((rv1) arrayList.get(2));
                return new on4(rv1VarM3819n3.f29661b, rv1VarM3819n3.f29662c, rv1VarM3819n3);
            case 8:
                return mn4.m8363a(d2, 36.0d);
            default:
                C0670g.m5864c();
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0107  */
    /* JADX INFO: renamed from: k */
    public double mo4465k(o41 o41Var, y41 y41Var) {
        o41 o41Var2;
        double d;
        double d2;
        double dM10673n;
        double d3;
        boolean z = y41Var.f34848c;
        yp1 yp1Var = o41Var.f26327h;
        yp1 yp1Var2 = o41Var.f26325f;
        double d4 = y41Var.f34849d;
        boolean z2 = d4 < 0.0d;
        yp1 yp1Var3 = o41Var.f26328i;
        Double dValueOf = null;
        sn4 sn4Var = yp1Var3 == null ? null : (sn4) yp1Var3.invoke(y41Var);
        if (sn4Var == null) {
            boolean z3 = z2;
            double dDoubleValue = ((Number) o41Var.f26322c.invoke(y41Var)).doubleValue();
            if (yp1Var2 == null || yp1Var == null) {
                return dDoubleValue;
            }
            o41 o41Var3 = (o41) yp1Var2.invoke(y41Var);
            double dM8941a = o41Var3 != null ? o41Var3.m8941a(y41Var) : 0.0d;
            bn0 bn0Var = (bn0) yp1Var.invoke(y41Var);
            double dM3637a = bn0Var != null ? bn0Var.m3637a(d4) : 0.0d;
            if (sc6.m10646R(dM8941a, dDoubleValue) < dM3637a) {
                dDoubleValue = C0006a5.m76n(dM8941a, dM3637a);
            }
            if (z3) {
                dDoubleValue = C0006a5.m76n(dM8941a, dM3637a);
            }
            if (o41Var.f26323d && 50.0d <= dDoubleValue && dDoubleValue < 60.0d) {
                dDoubleValue = sc6.m10646R(49.0d, dM8941a) >= dM3637a ? 49.0d : 60.0d;
            }
            yp1 yp1Var4 = o41Var.f26326g;
            if (yp1Var4 != null && (o41Var2 = (o41) yp1Var4.invoke(y41Var)) != null) {
                dValueOf = Double.valueOf(o41Var2.m8941a(y41Var));
            }
            if (dValueOf != null) {
                o41 o41Var4 = (o41) yp1Var2.invoke(y41Var);
                double dM8941a2 = o41Var4 != null ? o41Var4.m8941a(y41Var) : 0.0d;
                double dMax = Math.max(dM8941a2, dValueOf.doubleValue());
                double dMin = Math.min(dM8941a2, dValueOf.doubleValue());
                if (sc6.m10646R(dMax, dDoubleValue) < dM3637a || sc6.m10646R(dMin, dDoubleValue) < dM3637a) {
                    double dM10640L = sc6.m10640L(dMax, dM3637a);
                    double dM10682w = sc6.m10682w(dMin, dM3637a);
                    ArrayList arrayList = new ArrayList();
                    if (dM10640L != -1.0d) {
                        arrayList.add(Double.valueOf(dM10640L));
                    }
                    if (dM10682w != -1.0d) {
                        arrayList.add(Double.valueOf(dM10682w));
                    }
                    if (Math.rint(dM8941a2) < 60.0d || Math.rint(dValueOf.doubleValue()) < 60.0d) {
                        if (dM10640L == -1.0d) {
                            return 100.0d;
                        }
                        return dM10640L;
                    }
                    if (arrayList.size() == 1) {
                        return ((Number) hb0.m6299K0(arrayList)).doubleValue();
                    }
                    if (dM10682w == -1.0d) {
                        return 0.0d;
                    }
                    return dM10682w;
                }
            }
            return dDoubleValue;
        }
        o41 o41Var5 = sn4Var.f30411a;
        o41 o41Var6 = sn4Var.f30412b;
        double d5 = sn4Var.f30413c;
        tn4 tn4Var = sn4Var.f30414d;
        boolean z4 = sn4Var.f30415e;
        boolean z5 = tn4Var == tn4.f31273e || (tn4Var == tn4.f31270b && !z) || (tn4Var == tn4.f31269a && !z);
        o41 o41Var7 = z5 ? o41Var5 : o41Var6;
        if (z5) {
            o41Var5 = o41Var6;
        }
        String str = o41Var.f26320a;
        String str2 = o41Var7.f26320a;
        yp1 yp1Var5 = o41Var7.f26327h;
        boolean zM13387o = z62.m13387o(str, str2);
        double d6 = z ? 1 : -1;
        double dDoubleValue2 = ((Number) o41Var7.f26322c.invoke(y41Var)).doubleValue();
        yp1 yp1Var6 = o41Var5.f26322c;
        yp1 yp1Var7 = o41Var5.f26327h;
        double dDoubleValue3 = ((Number) yp1Var6.invoke(y41Var)).doubleValue();
        if (yp1Var2 == null || yp1Var5 == null || yp1Var7 == null) {
            d = d6;
            d2 = dDoubleValue2;
            dM10673n = d2;
        } else {
            o41 o41Var8 = (o41) yp1Var2.invoke(y41Var);
            bn0 bn0Var2 = (bn0) yp1Var5.invoke(y41Var);
            bn0 bn0Var3 = (bn0) yp1Var7.invoke(y41Var);
            if (o41Var8 == null || bn0Var2 == null || bn0Var3 == null) {
                d = d6;
                d2 = dDoubleValue2;
            } else {
                d = d6;
                double dM3637a2 = bn0Var2.m3637a(d4);
                double dM3637a3 = bn0Var3.m3637a(d4);
                double dM8941a3 = o41Var8.m8941a(y41Var);
                double dM10664e0 = sc6.m10664e0(dM8941a3);
                boolean z6 = z2;
                double dM10664e1 = sc6.m10664e0(dDoubleValue2);
                double dMax2 = Math.max(dM10664e0, dM10664e1);
                if (dMax2 != dM10664e1) {
                    dM10664e0 = dM10664e1;
                }
                double dM76n = (dMax2 + 5.0d) / (dM10664e0 + 5.0d) < dM3637a2 ? C0006a5.m76n(dM8941a3, dM3637a2) : dDoubleValue2;
                double dM10664e2 = sc6.m10664e0(dM8941a3);
                d2 = dM76n;
                double dM10664e3 = sc6.m10664e0(dDoubleValue3);
                double dMax3 = Math.max(dM10664e2, dM10664e3);
                if (dMax3 != dM10664e3) {
                    dM10664e2 = dM10664e3;
                }
                if ((dMax3 + 5.0d) / (dM10664e2 + 5.0d) < dM3637a3) {
                    dDoubleValue3 = C0006a5.m76n(dM8941a3, dM3637a3);
                }
                if (z6) {
                    dM10673n = C0006a5.m76n(dM8941a3, dM3637a2);
                    dDoubleValue3 = C0006a5.m76n(dM8941a3, dM3637a3);
                }
            }
            dM10673n = d2;
        }
        if ((dDoubleValue3 - dM10673n) * d < d5) {
            double d7 = d5 * d;
            dDoubleValue3 = sc6.m10673n(dM10673n + d7, 0.0d, 100.0d);
            if ((dDoubleValue3 - dM10673n) * d < d5) {
                dM10673n = sc6.m10673n(dDoubleValue3 - d7, 0.0d, 100.0d);
            }
        }
        double dMin2 = dDoubleValue3;
        if (50.0d > dM10673n || dM10673n >= 60.0d) {
            if (50.0d <= dMin2 && dMin2 < 60.0d) {
                if (!z4) {
                    dMin2 = d > 0.0d ? 60.0d : 49.0d;
                } else if (d > 0.0d) {
                    dMin2 = Math.max(dMin2, (d5 * d) + 60.0d);
                    d3 = 60.0d;
                } else {
                    dMin2 = Math.min(dMin2, (d5 * d) + 49.0d);
                    d3 = 49.0d;
                }
            }
            d3 = dM10673n;
        } else if (d > 0.0d) {
            dMin2 = Math.max(dMin2, (d5 * d) + 60.0d);
            d3 = 60.0d;
        } else {
            dMin2 = Math.min(dMin2, (d5 * d) + 49.0d);
            d3 = 49.0d;
        }
        return zM13387o ? d3 : dMin2;
    }

    /* JADX INFO: renamed from: l */
    public final o41 m12213l(y41 y41Var) {
        return y41Var.f34848c ? mo4475w() : mo4476x();
    }

    /* JADX INFO: renamed from: m */
    public o41 mo4466m() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "inverse_surface";
        mq4Var.f25142c = new vc0((byte) 4);
        mq4Var.f25143d = new vc0((byte) 14);
        mq4Var.f25140a = true;
        return mq4Var.m8369a();
    }

    /* JADX INFO: renamed from: o */
    public o41 mo4467o() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "primary";
        byte b = 2;
        mq4Var.f25142c = new rc0(b);
        mq4Var.f25143d = new rc0((byte) 3);
        mq4Var.f25140a = true;
        mq4Var.f25145f = new C0633f0(1, this, wc0.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, (byte) 9);
        mq4Var.f25147h = new rc0((byte) 4);
        qc0 qc0Var = new qc0(b);
        qc0Var.f28372b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25148i = qc0Var;
        return mq4Var.m8369a();
    }

    /* JADX INFO: renamed from: p */
    public o41 mo4468p() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "primary_container";
        mq4Var.f25142c = new C0499bp((byte) 21);
        rc0 rc0Var = new rc0((byte) 1);
        VarHandle.storeStoreFence();
        mq4Var.f25143d = rc0Var;
        mq4Var.f25140a = true;
        mq4Var.f25145f = new C0633f0(1, this, wc0.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, (byte) 10);
        mq4Var.f25147h = new rc0((byte) 11);
        qc0 qc0Var = new qc0((byte) 4);
        qc0Var.f28372b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25148i = qc0Var;
        return mq4Var.m8369a();
    }

    /* JADX INFO: renamed from: q */
    public o41 mo4469q() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "primary_fixed";
        mq4Var.f25142c = new rc0((byte) 9);
        mq4Var.f25143d = new rc0((byte) 10);
        mq4Var.f25140a = true;
        mq4Var.f25145f = new C0633f0(1, this, wc0.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, (byte) 11);
        mq4Var.f25147h = new rc0((byte) 12);
        qc0 qc0Var = new qc0((byte) 3);
        qc0Var.f28372b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25148i = qc0Var;
        return mq4Var.m8369a();
    }

    /* JADX INFO: renamed from: r */
    public o41 mo4470r() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "primary_fixed_dim";
        mq4Var.f25142c = new uc0((byte) 18);
        mq4Var.f25143d = new uc0((byte) 19);
        mq4Var.f25140a = true;
        mq4Var.f25145f = new C0633f0(1, this, wc0.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, (byte) 12);
        mq4Var.f25147h = new uc0((byte) 20);
        qc0 qc0Var = new qc0((byte) 11);
        qc0Var.f28372b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25148i = qc0Var;
        return mq4Var.m8369a();
    }

    /* JADX INFO: renamed from: s */
    public o41 mo4471s() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "secondary";
        mq4Var.f25142c = new sc0((byte) 1);
        mq4Var.f25143d = new sc0((byte) 12);
        mq4Var.f25140a = true;
        mq4Var.f25145f = new C0633f0(1, this, wc0.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, (byte) 13);
        mq4Var.f25147h = new sc0((byte) 20);
        qc0 qc0Var = new qc0((byte) 6);
        qc0Var.f28372b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25148i = qc0Var;
        return mq4Var.m8369a();
    }

    /* JADX INFO: renamed from: t */
    public o41 mo4472t() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "secondary_container";
        mq4Var.f25142c = new vc0((byte) 10);
        vc0 vc0Var = new vc0((byte) 11);
        VarHandle.storeStoreFence();
        mq4Var.f25143d = vc0Var;
        mq4Var.f25140a = true;
        mq4Var.f25145f = new C0633f0(1, this, wc0.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, (byte) 14);
        mq4Var.f25147h = new vc0((byte) 12);
        qc0 qc0Var = new qc0((byte) 13);
        qc0Var.f28372b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25148i = qc0Var;
        return mq4Var.m8369a();
    }

    /* JADX INFO: renamed from: u */
    public o41 mo4473u() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "secondary_fixed";
        mq4Var.f25142c = new uc0((byte) 5);
        mq4Var.f25143d = new uc0((byte) 6);
        mq4Var.f25140a = true;
        mq4Var.f25145f = new C0633f0(1, this, wc0.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, (byte) 15);
        mq4Var.f25147h = new uc0((byte) 7);
        qc0 qc0Var = new qc0((byte) 10);
        qc0Var.f28372b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25148i = qc0Var;
        return mq4Var.m8369a();
    }

    /* JADX INFO: renamed from: v */
    public o41 mo4474v() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "secondary_fixed_dim";
        mq4Var.f25142c = new uc0((byte) 21);
        mq4Var.f25143d = new uc0((byte) 22);
        mq4Var.f25140a = true;
        mq4Var.f25145f = new C0633f0(1, this, wc0.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, (byte) 16);
        mq4Var.f25147h = new uc0((byte) 23);
        qc0 qc0Var = new qc0((byte) 12);
        qc0Var.f28372b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25148i = qc0Var;
        return mq4Var.m8369a();
    }

    /* JADX INFO: renamed from: w */
    public o41 mo4475w() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "surface_bright";
        mq4Var.f25142c = new rc0((byte) 26);
        mq4Var.f25143d = new rc0((byte) 27);
        mq4Var.f25140a = true;
        return mq4Var.m8369a();
    }

    /* JADX INFO: renamed from: x */
    public o41 mo4476x() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "surface_dim";
        mq4Var.f25142c = new sc0((byte) 27);
        mq4Var.f25143d = new sc0((byte) 28);
        mq4Var.f25140a = true;
        return mq4Var.m8369a();
    }

    /* JADX INFO: renamed from: y */
    public o41 mo4477y() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "tertiary";
        mq4Var.f25142c = new tc0((byte) 12);
        mq4Var.f25143d = new tc0((byte) 13);
        mq4Var.f25140a = true;
        mq4Var.f25145f = new C0633f0(1, this, wc0.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, (byte) 17);
        mq4Var.f25147h = new tc0((byte) 15);
        qc0 qc0Var = new qc0((byte) 8);
        qc0Var.f28372b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25148i = qc0Var;
        return mq4Var.m8369a();
    }

    /* JADX INFO: renamed from: z */
    public o41 mo4478z() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "tertiary_container";
        mq4Var.f25142c = new sc0((byte) 17);
        sc0 sc0Var = new sc0((byte) 18);
        VarHandle.storeStoreFence();
        mq4Var.f25143d = sc0Var;
        mq4Var.f25140a = true;
        mq4Var.f25145f = new C0633f0(1, this, wc0.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, (byte) 18);
        mq4Var.f25147h = new sc0((byte) 19);
        qc0 qc0Var = new qc0((byte) 5);
        qc0Var.f28372b = this;
        VarHandle.storeStoreFence();
        mq4Var.f25148i = qc0Var;
        return mq4Var.m8369a();
    }
}
