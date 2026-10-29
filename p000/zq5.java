package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zq5 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f36268a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ byte f36269b;

    public zq5(byte b) {
        this.f36269b = b;
    }

    /* JADX INFO: renamed from: c */
    public static vp5 m13721c(r36 r36Var, List list) {
        kt5 kt5Var = kt5.f23459b;
        w76.m12156c("FN", 2, list);
        int i = 0;
        aq5 aq5VarM13122t = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) list.get(0));
        aq5 aq5VarM13122t2 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) list.get(1));
        if (!(aq5VarM13122t2 instanceof do5)) {
            C1077qn.m9987m(zi4.m13620t("FN requires an ArrayValue of parameter names found ", aq5VarM13122t2.getClass().getCanonicalName()));
            return null;
        }
        List listM4626g = ((do5) aq5VarM13122t2).m4626g();
        Collection arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        vp5 vp5Var = new vp5(aq5VarM13122t.mo3117h());
        vp5Var.f32785c = new ArrayList();
        vp5Var.f32787e = r36Var;
        ArrayList arrayList2 = (ArrayList) listM4626g;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                vp5Var.f32785c.add(((aq5) obj).mo3117h());
            }
        }
        vp5Var.f32786d = new ArrayList(arrayList);
        return vp5Var;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m13722d(aq5 aq5Var, aq5 aq5Var2) {
        if (aq5Var instanceof ip5) {
            aq5Var = new sq5(aq5Var.mo3117h());
        }
        if (aq5Var2 instanceof ip5) {
            aq5Var2 = new sq5(aq5Var2.mo3117h());
        }
        if ((aq5Var instanceof sq5) && (aq5Var2 instanceof sq5)) {
            return ((sq5) aq5Var).f30510a.compareTo(((sq5) aq5Var2).f30510a) < 0;
        }
        double dDoubleValue = aq5Var.mo3119m().doubleValue();
        double dDoubleValue2 = aq5Var2.mo3119m().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public static aq5 m13723e(ns5 ns5Var, aq5 aq5Var, aq5 aq5Var2) {
        if (aq5Var instanceof Iterable) {
            return m13725g(ns5Var, ((Iterable) aq5Var).iterator(), aq5Var2);
        }
        C1077qn.m9987m("Non-iterable type in for...of loop.");
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m13724f(aq5 aq5Var, aq5 aq5Var2) {
        if (aq5Var.getClass().equals(aq5Var2.getClass())) {
            if ((aq5Var instanceof vq5) || (aq5Var instanceof rp5)) {
                return true;
            }
            if (aq5Var instanceof xo5) {
                return (Double.isNaN(aq5Var.mo3119m().doubleValue()) || Double.isNaN(aq5Var2.mo3119m().doubleValue()) || aq5Var.mo3119m().doubleValue() != aq5Var2.mo3119m().doubleValue()) ? false : true;
            }
            if (aq5Var instanceof sq5) {
                return aq5Var.mo3117h().equals(aq5Var2.mo3117h());
            }
            if (aq5Var instanceof jo5) {
                return aq5Var.mo3116a().equals(aq5Var2.mo3116a());
            }
            return aq5Var == aq5Var2;
        }
        if (((aq5Var instanceof vq5) || (aq5Var instanceof rp5)) && ((aq5Var2 instanceof vq5) || (aq5Var2 instanceof rp5))) {
            return true;
        }
        boolean z = aq5Var instanceof xo5;
        if (z && (aq5Var2 instanceof sq5)) {
            return m13724f(aq5Var, new xo5(aq5Var2.mo3119m()));
        }
        boolean z2 = aq5Var instanceof sq5;
        if (z2 && (aq5Var2 instanceof xo5)) {
            return m13724f(new xo5(aq5Var.mo3119m()), aq5Var2);
        }
        if (aq5Var instanceof jo5) {
            return m13724f(new xo5(aq5Var.mo3119m()), aq5Var2);
        }
        if (aq5Var2 instanceof jo5) {
            return m13724f(aq5Var, new xo5(aq5Var2.mo3119m()));
        }
        if ((z2 || z) && (aq5Var2 instanceof ip5)) {
            return m13724f(aq5Var, new sq5(aq5Var2.mo3117h()));
        }
        if ((aq5Var instanceof ip5) && ((aq5Var2 instanceof sq5) || (aq5Var2 instanceof xo5))) {
            return m13724f(new sq5(aq5Var.mo3117h()), aq5Var2);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static aq5 m13725g(ns5 ns5Var, Iterator it, aq5 aq5Var) {
        if (it != null) {
            while (it.hasNext()) {
                aq5 aq5VarM10194e = ns5Var.mo5322g((aq5) it.next()).m10194e((do5) aq5Var);
                if (aq5VarM10194e instanceof po5) {
                    po5 po5Var = (po5) aq5VarM10194e;
                    String str = po5Var.f27869b;
                    if ("break".equals(str)) {
                        return aq5.f14781np;
                    }
                    if ("return".equals(str)) {
                        return po5Var;
                    }
                }
            }
        }
        return aq5.f14781np;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m13726h(aq5 aq5Var, aq5 aq5Var2) {
        if (aq5Var instanceof ip5) {
            aq5Var = new sq5(aq5Var.mo3117h());
        }
        if (aq5Var2 instanceof ip5) {
            aq5Var2 = new sq5(aq5Var2.mo3117h());
        }
        return (((aq5Var instanceof sq5) && (aq5Var2 instanceof sq5)) || !(Double.isNaN(aq5Var.mo3119m().doubleValue()) || Double.isNaN(aq5Var2.mo3119m().doubleValue()))) && !m13722d(aq5Var2, aq5Var);
    }

    /* JADX WARN: Code duplicated, block: B:399:0x0bba  */
    /* JADX WARN: Code duplicated, block: B:562:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v315 */
    /* JADX WARN: Type inference failed for: r10v320 */
    /* JADX WARN: Type inference failed for: r10v340, types: [do5] */
    /* JADX WARN: Type inference failed for: r10v347, types: [mp5] */
    /* JADX WARN: Type inference failed for: r10v383 */
    /* JADX WARN: Type inference failed for: r10v384 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, r36] */
    /* JADX WARN: Type inference failed for: r7v54, types: [aq5] */
    /* JADX INFO: renamed from: a */
    public final aq5 m13727a(String str, r36 r36Var, ArrayList arrayList) {
        boolean zM13724f;
        boolean zM13724f2;
        aq5 aq5Var;
        aq5 aq5VarM10194e;
        vq5 vq5Var;
        po5 po5Var;
        aq5 sq5Var;
        ?? do5Var;
        String str2;
        int i = 0;
        switch (this.f36269b) {
            case 0:
                kt5 kt5Var = kt5.f23459b;
                switch (w76.m12160g(str).ordinal()) {
                    case 4:
                        w76.m12154a("BITWISE_AND", 2, arrayList);
                        return new xo5(Double.valueOf(w76.m12162i(((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0)).mo3119m().doubleValue()) & w76.m12162i(((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(1)).mo3119m().doubleValue())));
                    case 5:
                        w76.m12154a("BITWISE_LEFT_SHIFT", 2, arrayList);
                        return new xo5(Double.valueOf(w76.m12162i(((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0)).mo3119m().doubleValue()) << ((int) (((long) w76.m12162i(((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(1)).mo3119m().doubleValue())) & 31))));
                    case 6:
                        w76.m12154a("BITWISE_NOT", 1, arrayList);
                        return new xo5(Double.valueOf(~w76.m12162i(((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0)).mo3119m().doubleValue())));
                    case 7:
                        w76.m12154a("BITWISE_OR", 2, arrayList);
                        return new xo5(Double.valueOf(w76.m12162i(((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0)).mo3119m().doubleValue()) | w76.m12162i(((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(1)).mo3119m().doubleValue())));
                    case 8:
                        w76.m12154a("BITWISE_RIGHT_SHIFT", 2, arrayList);
                        return new xo5(Double.valueOf(w76.m12162i(((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0)).mo3119m().doubleValue()) >> ((int) (((long) w76.m12162i(((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(1)).mo3119m().doubleValue())) & 31))));
                    case 9:
                        w76.m12154a("BITWISE_UNSIGNED_RIGHT_SHIFT", 2, arrayList);
                        return new xo5(Double.valueOf((((long) w76.m12162i(((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0)).mo3119m().doubleValue())) & 4294967295L) >>> ((int) (((long) w76.m12162i(((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(1)).mo3119m().doubleValue())) & 31))));
                    case 10:
                        w76.m12154a("BITWISE_XOR", 2, arrayList);
                        return new xo5(Double.valueOf(w76.m12162i(((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0)).mo3119m().doubleValue()) ^ w76.m12162i(((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(1)).mo3119m().doubleValue())));
                    default:
                        m13728b(str);
                        throw null;
                }
            case 1:
                w76.m12154a(w76.m12160g(str).name(), 2, arrayList);
                aq5 aq5VarM13122t = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0));
                aq5 aq5VarM13122t2 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(1));
                int iOrdinal = w76.m12160g(str).ordinal();
                if (iOrdinal != 23) {
                    if (iOrdinal == 48) {
                        zM13724f2 = m13724f(aq5VarM13122t, aq5VarM13122t2);
                    } else if (iOrdinal == 42) {
                        zM13724f = m13722d(aq5VarM13122t, aq5VarM13122t2);
                    } else if (iOrdinal != 43) {
                        switch (iOrdinal) {
                            case 37:
                                zM13724f = m13722d(aq5VarM13122t2, aq5VarM13122t);
                                break;
                            case 38:
                                zM13724f = m13726h(aq5VarM13122t2, aq5VarM13122t);
                                break;
                            case 39:
                                zM13724f = w76.m12161h(aq5VarM13122t, aq5VarM13122t2);
                                break;
                            case 40:
                                zM13724f2 = w76.m12161h(aq5VarM13122t, aq5VarM13122t2);
                                break;
                            default:
                                m13728b(str);
                                throw null;
                        }
                    } else {
                        zM13724f = m13726h(aq5VarM13122t, aq5VarM13122t2);
                    }
                    zM13724f = !zM13724f2;
                } else {
                    zM13724f = m13724f(aq5VarM13122t, aq5VarM13122t2);
                }
                return zM13724f ? aq5.f14786sp : aq5.f14787tp;
            case 2:
                kt5 kt5Var2 = kt5.f23459b;
                int iOrdinal2 = w76.m12160g(str).ordinal();
                if (iOrdinal2 == 2) {
                    w76.m12154a("APPLY", 3, arrayList);
                    aq5 aq5Var2 = (aq5) arrayList.get(0);
                    yg3 yg3Var = (yg3) r36Var.f28986b;
                    yg3 yg3Var2 = (yg3) r36Var.f28986b;
                    aq5 aq5VarM13122t3 = yg3Var.m13122t(r36Var, aq5Var2);
                    String strMo3117h = yg3Var2.m13122t(r36Var, (aq5) arrayList.get(1)).mo3117h();
                    aq5 aq5VarM13122t4 = yg3Var2.m13122t(r36Var, (aq5) arrayList.get(2));
                    if (!(aq5VarM13122t4 instanceof do5)) {
                        C1077qn.m9987m(zi4.m13620t("Function arguments for Apply are not a list found ", aq5VarM13122t4.getClass().getCanonicalName()));
                        return null;
                    }
                    if (!strMo3117h.isEmpty()) {
                        return aq5VarM13122t3.mo3120q(strMo3117h, r36Var, (ArrayList) ((do5) aq5VarM13122t4).m4626g());
                    }
                    C1077qn.m9987m("Function name for apply is undefined");
                    return null;
                }
                if (iOrdinal2 == 15) {
                    w76.m12154a("BREAK", 0, arrayList);
                    return aq5.f14783pp;
                }
                if (iOrdinal2 == 25) {
                    return m13721c(r36Var, arrayList);
                }
                if (iOrdinal2 == 41) {
                    w76.m12156c("IF", 2, arrayList);
                    aq5 aq5Var3 = (aq5) arrayList.get(0);
                    yg3 yg3Var3 = (yg3) r36Var.f28986b;
                    yg3 yg3Var4 = (yg3) r36Var.f28986b;
                    aq5 aq5VarM13122t5 = yg3Var3.m13122t(r36Var, aq5Var3);
                    aq5 aq5VarM13122t6 = yg3Var4.m13122t(r36Var, (aq5) arrayList.get(1));
                    aq5 aq5VarM13122t7 = arrayList.size() > 2 ? yg3Var4.m13122t(r36Var, (aq5) arrayList.get(2)) : null;
                    vq5 vq5Var2 = aq5.f14781np;
                    if (!aq5VarM13122t5.mo3116a().booleanValue()) {
                        if (aq5VarM13122t7 != null) {
                            aq5VarM10194e = r36Var.m10194e((do5) aq5VarM13122t7);
                        } else {
                            aq5Var = vq5Var2;
                        }
                        if (true != (aq5Var instanceof po5)) {
                            return vq5Var2;
                        }
                        return aq5Var;
                    }
                    aq5VarM10194e = r36Var.m10194e((do5) aq5VarM13122t6);
                    aq5Var = aq5VarM10194e;
                    if (true != (aq5Var instanceof po5)) {
                        return vq5Var2;
                    }
                    return aq5Var;
                }
                if (iOrdinal2 == 54) {
                    return new do5(arrayList);
                }
                if (iOrdinal2 == 57) {
                    if (arrayList.isEmpty()) {
                        return aq5.f14785rp;
                    }
                    w76.m12154a("RETURN", 1, arrayList);
                    return new po5("return", ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0)));
                }
                if (iOrdinal2 != 19) {
                    if (iOrdinal2 == 20) {
                        w76.m12156c("DEFINE_FUNCTION", 2, arrayList);
                        vp5 vp5VarM13721c = m13721c(r36Var, arrayList);
                        String str3 = vp5VarM13721c.f17271a;
                        if (str3 == null) {
                            r36Var.m10198i("", vp5VarM13721c);
                            return vp5VarM13721c;
                        }
                        r36Var.m10198i(str3, vp5VarM13721c);
                        return vp5VarM13721c;
                    }
                    if (iOrdinal2 == 60) {
                        w76.m12154a("SWITCH", 3, arrayList);
                        aq5 aq5Var4 = (aq5) arrayList.get(0);
                        yg3 yg3Var5 = (yg3) r36Var.f28986b;
                        yg3 yg3Var6 = (yg3) r36Var.f28986b;
                        aq5 aq5VarM13122t8 = yg3Var5.m13122t(r36Var, aq5Var4);
                        aq5 aq5VarM13122t9 = yg3Var6.m13122t(r36Var, (aq5) arrayList.get(1));
                        aq5 aq5VarM13122t10 = yg3Var6.m13122t(r36Var, (aq5) arrayList.get(2));
                        if (!(aq5VarM13122t9 instanceof do5)) {
                            C1077qn.m9987m("Malformed SWITCH statement, cases are not a list");
                            return null;
                        }
                        if (!(aq5VarM13122t10 instanceof do5)) {
                            C1077qn.m9987m("Malformed SWITCH statement, case statements are not a list");
                            return null;
                        }
                        do5 do5Var2 = (do5) aq5VarM13122t9;
                        do5 do5Var3 = (do5) aq5VarM13122t10;
                        boolean z = false;
                        for (int i2 = 0; i2 < do5Var2.m4628t(); i2++) {
                            if (z || aq5VarM13122t8.equals(yg3Var6.m13122t(r36Var, do5Var2.m4629u(i2)))) {
                                aq5 aq5VarM13122t11 = yg3Var6.m13122t(r36Var, do5Var3.m4629u(i2));
                                if (aq5VarM13122t11 instanceof po5) {
                                    return ((po5) aq5VarM13122t11).f27869b.equals("break") ? aq5.f14781np : aq5VarM13122t11;
                                }
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (do5Var2.m4628t() + 1 == do5Var3.m4628t()) {
                            aq5 aq5VarM13122t12 = yg3Var6.m13122t(r36Var, do5Var3.m4629u(do5Var2.m4628t()));
                            if (aq5VarM13122t12 instanceof po5) {
                                String str4 = ((po5) aq5VarM13122t12).f27869b;
                                if (str4.equals("return") || str4.equals("continue")) {
                                    return aq5VarM13122t12;
                                }
                            }
                        }
                        return aq5.f14781np;
                    }
                    if (iOrdinal2 == 61) {
                        w76.m12154a("TERNARY", 3, arrayList);
                        aq5 aq5Var5 = (aq5) arrayList.get(0);
                        yg3 yg3Var7 = (yg3) r36Var.f28986b;
                        yg3 yg3Var8 = (yg3) r36Var.f28986b;
                        return yg3Var7.m13122t(r36Var, aq5Var5).mo3116a().booleanValue() ? yg3Var8.m13122t(r36Var, (aq5) arrayList.get(1)) : yg3Var8.m13122t(r36Var, (aq5) arrayList.get(2));
                    }
                    switch (iOrdinal2) {
                        case 11:
                            return r36Var.m10196g().m10194e(new do5(arrayList));
                        case 12:
                            w76.m12154a("BREAK", 0, arrayList);
                            return aq5.f14784qp;
                        case 13:
                            break;
                        default:
                            m13728b(str);
                            throw null;
                    }
                }
                if (arrayList.isEmpty()) {
                    return aq5.f14781np;
                }
                aq5 aq5VarM13122t13 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0));
                return aq5VarM13122t13 instanceof do5 ? r36Var.m10194e((do5) aq5VarM13122t13) : aq5.f14781np;
            case 3:
                kt5 kt5Var3 = kt5.f23459b;
                int iOrdinal3 = w76.m12160g(str).ordinal();
                if (iOrdinal3 == 1) {
                    w76.m12154a("AND", 2, arrayList);
                    aq5 aq5VarM13122t14 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0));
                    if (aq5VarM13122t14.mo3116a().booleanValue()) {
                        return ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(1));
                    }
                    return aq5VarM13122t14;
                }
                if (iOrdinal3 == 47) {
                    w76.m12154a("NOT", 1, arrayList);
                    return new jo5(Boolean.valueOf(!((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0)).mo3116a().booleanValue()));
                }
                if (iOrdinal3 != 50) {
                    m13728b(str);
                    throw null;
                }
                w76.m12154a("OR", 2, arrayList);
                aq5 aq5VarM13122t15 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0));
                if (aq5VarM13122t15.mo3116a().booleanValue()) {
                    return aq5VarM13122t15;
                }
                return ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(1));
            case 4:
                kt5 kt5Var4 = kt5.f23459b;
                int iOrdinal4 = w76.m12160g(str).ordinal();
                if (iOrdinal4 == 65) {
                    w76.m12154a("WHILE", 4, arrayList);
                    aq5 aq5Var6 = (aq5) arrayList.get(0);
                    aq5 aq5Var7 = (aq5) arrayList.get(1);
                    aq5 aq5Var8 = (aq5) arrayList.get(2);
                    aq5 aq5Var9 = (aq5) arrayList.get(3);
                    yg3 yg3Var9 = (yg3) r36Var.f28986b;
                    yg3 yg3Var10 = (yg3) r36Var.f28986b;
                    aq5 aq5VarM13122t16 = yg3Var9.m13122t(r36Var, aq5Var9);
                    if (yg3Var10.m13122t(r36Var, aq5Var8).mo3116a().booleanValue()) {
                        aq5 aq5VarM10194e2 = r36Var.m10194e((do5) aq5VarM13122t16);
                        if (aq5VarM10194e2 instanceof po5) {
                            po5 po5Var2 = (po5) aq5VarM10194e2;
                            String str5 = po5Var2.f27869b;
                            if ("break".equals(str5)) {
                                return aq5.f14781np;
                            }
                            if ("return".equals(str5)) {
                                return po5Var2;
                            }
                        }
                    }
                    while (yg3Var10.m13122t(r36Var, aq5Var6).mo3116a().booleanValue()) {
                        aq5 aq5VarM10194e3 = r36Var.m10194e((do5) aq5VarM13122t16);
                        if (aq5VarM10194e3 instanceof po5) {
                            po5 po5Var3 = (po5) aq5VarM10194e3;
                            String str6 = po5Var3.f27869b;
                            if ("break".equals(str6)) {
                                return aq5.f14781np;
                            }
                            if ("return".equals(str6)) {
                                return po5Var3;
                            }
                        }
                        r36Var.m10191b(aq5Var7);
                    }
                    return aq5.f14781np;
                }
                switch (iOrdinal4) {
                    case 26:
                        w76.m12154a("FOR_IN", 3, arrayList);
                        if (!(arrayList.get(0) instanceof sq5)) {
                            C1077qn.m9987m("Variable name in FOR_IN must be a string");
                            return null;
                        }
                        String strMo3117h2 = ((aq5) arrayList.get(0)).mo3117h();
                        aq5 aq5VarM13122t17 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(1));
                        aq5 aq5VarM13122t18 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(2));
                        Iterator itMo3118l = aq5VarM13122t17.mo3118l();
                        if (itMo3118l != null) {
                            while (itMo3118l.hasNext()) {
                                r36Var.m10199k(strMo3117h2, (aq5) itMo3118l.next());
                                aq5 aq5VarM10194e4 = r36Var.m10194e((do5) aq5VarM13122t18);
                                if (aq5VarM10194e4 instanceof po5) {
                                    po5Var = (po5) aq5VarM10194e4;
                                    String str7 = po5Var.f27869b;
                                    if ("break".equals(str7)) {
                                        vq5Var = aq5.f14781np;
                                    } else if ("return".equals(str7)) {
                                        return po5Var;
                                    }
                                }
                            }
                            vq5Var = aq5.f14781np;
                        } else {
                            vq5Var = aq5.f14781np;
                        }
                        return vq5Var;
                    case 27:
                        w76.m12154a("FOR_IN_CONST", 3, arrayList);
                        if (arrayList.get(0) instanceof sq5) {
                            return m13725g(new es5(r36Var, ((aq5) arrayList.get(0)).mo3117h(), (byte) 0), ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(1)).mo3118l(), ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(2)));
                        }
                        C1077qn.m9987m("Variable name in FOR_IN_CONST must be a string");
                        return null;
                    case 28:
                        w76.m12154a("FOR_IN_LET", 3, arrayList);
                        if (!(arrayList.get(0) instanceof sq5)) {
                            C1077qn.m9987m("Variable name in FOR_IN_LET must be a string");
                            return null;
                        }
                        String strMo3117h3 = ((aq5) arrayList.get(0)).mo3117h();
                        aq5 aq5VarM13122t19 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(1));
                        aq5 aq5VarM13122t20 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(2));
                        Iterator itMo3118l2 = aq5VarM13122t19.mo3118l();
                        if (itMo3118l2 != null) {
                            while (itMo3118l2.hasNext()) {
                                aq5 aq5Var10 = (aq5) itMo3118l2.next();
                                r36 r36VarM10196g = r36Var.m10196g();
                                r36VarM10196g.m10199k(strMo3117h3, aq5Var10);
                                aq5 aq5VarM10194e5 = r36VarM10196g.m10194e((do5) aq5VarM13122t20);
                                if (aq5VarM10194e5 instanceof po5) {
                                    po5Var = (po5) aq5VarM10194e5;
                                    String str8 = po5Var.f27869b;
                                    if ("break".equals(str8)) {
                                        vq5Var = aq5.f14781np;
                                    } else if ("return".equals(str8)) {
                                        return po5Var;
                                    }
                                }
                            }
                            vq5Var = aq5.f14781np;
                        } else {
                            vq5Var = aq5.f14781np;
                        }
                        return vq5Var;
                    case 29:
                        w76.m12154a("FOR_LET", 4, arrayList);
                        aq5 aq5Var11 = (aq5) arrayList.get(0);
                        yg3 yg3Var11 = (yg3) r36Var.f28986b;
                        yg3 yg3Var12 = (yg3) r36Var.f28986b;
                        aq5 aq5VarM13122t21 = yg3Var11.m13122t(r36Var, aq5Var11);
                        if (!(aq5VarM13122t21 instanceof do5)) {
                            C1077qn.m9987m("Initializer variables in FOR_LET must be an ArrayList");
                            return null;
                        }
                        do5 do5Var4 = (do5) aq5VarM13122t21;
                        aq5 aq5Var12 = (aq5) arrayList.get(1);
                        aq5 aq5Var13 = (aq5) arrayList.get(2);
                        aq5 aq5VarM13122t22 = yg3Var12.m13122t(r36Var, (aq5) arrayList.get(3));
                        r36 r36VarM10196g2 = r36Var.m10196g();
                        for (int i3 = 0; i3 < do5Var4.m4628t(); i3++) {
                            String strMo3117h4 = do5Var4.m4629u(i3).mo3117h();
                            r36VarM10196g2.m10198i(strMo3117h4, r36Var.m10200l(strMo3117h4));
                        }
                        while (yg3Var12.m13122t(r36Var, aq5Var12).mo3116a().booleanValue()) {
                            aq5 aq5VarM10194e6 = r36Var.m10194e((do5) aq5VarM13122t22);
                            if (aq5VarM10194e6 instanceof po5) {
                                po5 po5Var4 = (po5) aq5VarM10194e6;
                                String str9 = po5Var4.f27869b;
                                if ("break".equals(str9)) {
                                    return aq5.f14781np;
                                }
                                if ("return".equals(str9)) {
                                    return po5Var4;
                                }
                            }
                            r36 r36VarM10196g3 = r36Var.m10196g();
                            for (int i4 = 0; i4 < do5Var4.m4628t(); i4++) {
                                String strMo3117h5 = do5Var4.m4629u(i4).mo3117h();
                                r36VarM10196g3.m10198i(strMo3117h5, r36VarM10196g2.m10200l(strMo3117h5));
                            }
                            r36VarM10196g3.m10191b(aq5Var13);
                            r36VarM10196g2 = r36VarM10196g3;
                        }
                        return aq5.f14781np;
                    case 30:
                        w76.m12154a("FOR_OF", 3, arrayList);
                        if (arrayList.get(0) instanceof sq5) {
                            return m13723e(new es5(r36Var, ((aq5) arrayList.get(0)).mo3117h(), (byte) 1), ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(1)), ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(2)));
                        }
                        C1077qn.m9987m("Variable name in FOR_OF must be a string");
                        return null;
                    case 31:
                        w76.m12154a("FOR_OF_CONST", 3, arrayList);
                        if (arrayList.get(0) instanceof sq5) {
                            return m13723e(new es5(r36Var, ((aq5) arrayList.get(0)).mo3117h(), (byte) 0), ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(1)), ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(2)));
                        }
                        C1077qn.m9987m("Variable name in FOR_OF_CONST must be a string");
                        return null;
                    case 32:
                        w76.m12154a("FOR_OF_LET", 3, arrayList);
                        if (arrayList.get(0) instanceof sq5) {
                            return m13723e(new yg3(r36Var, ((aq5) arrayList.get(0)).mo3117h(), (byte) 13), ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(1)), ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(2)));
                        }
                        C1077qn.m9987m("Variable name in FOR_OF_LET must be a string");
                        return null;
                    default:
                        m13728b(str);
                        throw null;
                }
            case 5:
                kt5 kt5Var5 = kt5.f23459b;
                int iOrdinal5 = w76.m12160g(str).ordinal();
                if (iOrdinal5 == 0) {
                    w76.m12154a("ADD", 2, arrayList);
                    aq5 aq5VarM13122t23 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0));
                    aq5 aq5VarM13122t24 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(1));
                    sq5Var = ((aq5VarM13122t23 instanceof ip5) || (aq5VarM13122t23 instanceof sq5) || (aq5VarM13122t24 instanceof ip5) || (aq5VarM13122t24 instanceof sq5)) ? new sq5(String.valueOf(aq5VarM13122t23.mo3117h()).concat(String.valueOf(aq5VarM13122t24.mo3117h()))) : new xo5(Double.valueOf(aq5VarM13122t24.mo3119m().doubleValue() + aq5VarM13122t23.mo3119m().doubleValue()));
                } else if (iOrdinal5 == 21) {
                    w76.m12154a("DIVIDE", 2, arrayList);
                    sq5Var = new xo5(Double.valueOf(((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0)).mo3119m().doubleValue() / ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(1)).mo3119m().doubleValue()));
                } else {
                    if (iOrdinal5 == 59) {
                        w76.m12154a("SUBTRACT", 2, arrayList);
                        return new xo5(Double.valueOf(((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0)).mo3119m().doubleValue() + (-((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(1)).mo3119m().doubleValue())));
                    }
                    if (iOrdinal5 == 52 || iOrdinal5 == 53) {
                        w76.m12154a(str, 2, arrayList);
                        aq5 aq5VarM13122t25 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0));
                        r36Var.m10191b((aq5) arrayList.get(1));
                        return aq5VarM13122t25;
                    }
                    if (iOrdinal5 == 55 || iOrdinal5 == 56) {
                        w76.m12154a(str, 1, arrayList);
                        return ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0));
                    }
                    switch (iOrdinal5) {
                        case 44:
                            w76.m12154a("MODULUS", 2, arrayList);
                            sq5Var = new xo5(Double.valueOf(((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0)).mo3119m().doubleValue() % ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(1)).mo3119m().doubleValue()));
                            break;
                        case 45:
                            w76.m12154a("MULTIPLY", 2, arrayList);
                            return new xo5(Double.valueOf(((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(1)).mo3119m().doubleValue() * ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0)).mo3119m().doubleValue()));
                        case 46:
                            w76.m12154a("NEGATE", 1, arrayList);
                            return new xo5(Double.valueOf(-((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0)).mo3119m().doubleValue()));
                        default:
                            m13728b(str);
                            throw null;
                    }
                }
                return sq5Var;
            case 6:
                if (str == null || str.isEmpty() || !r36Var.m10197h(str)) {
                    C1077qn.m9987m(zi4.m13620t("Command not found: ", str));
                    return null;
                }
                aq5 aq5VarM10200l = r36Var.m10200l(str);
                if (aq5VarM10200l instanceof dp5) {
                    return ((dp5) aq5VarM10200l).mo4517f(r36Var, arrayList);
                }
                C1077qn.m9987m(zi4.m13621u("Function ", str, " is not defined"));
                return null;
            default:
                kt5 kt5Var6 = kt5.f23459b;
                int iOrdinal6 = w76.m12160g(str).ordinal();
                if (iOrdinal6 == 3) {
                    w76.m12154a("ASSIGN", 2, arrayList);
                    aq5 aq5VarM13122t26 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0));
                    if (!(aq5VarM13122t26 instanceof sq5)) {
                        C1077qn.m9987m(zi4.m13620t("Expected string for assign var. got ", aq5VarM13122t26.getClass().getCanonicalName()));
                        return null;
                    }
                    String str10 = ((sq5) aq5VarM13122t26).f30510a;
                    if (!r36Var.m10197h(str10)) {
                        C1077qn.m9987m(zi4.m13620t("Attempting to assign undefined value ", str10));
                        return null;
                    }
                    aq5 aq5VarM13122t27 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(1));
                    r36Var.m10198i(str10, aq5VarM13122t27);
                    return aq5VarM13122t27;
                }
                if (iOrdinal6 == 14) {
                    w76.m12156c("CONST", 2, arrayList);
                    if (arrayList.size() % 2 != 0) {
                        C1077qn.m9987m(c75.m3877i(arrayList.size(), "CONST requires an even number of arguments, found "));
                        return null;
                    }
                    while (i < arrayList.size() - 1) {
                        aq5 aq5VarM13122t28 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(i));
                        if (!(aq5VarM13122t28 instanceof sq5)) {
                            C1077qn.m9987m(zi4.m13620t("Expected string for const name. got ", aq5VarM13122t28.getClass().getCanonicalName()));
                            return null;
                        }
                        String str11 = ((sq5) aq5VarM13122t28).f30510a;
                        r36Var.m10199k(str11, ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(i + 1)));
                        ((HashMap) r36Var.f28988d).put(str11, Boolean.TRUE);
                        i += 2;
                    }
                    return aq5.f14781np;
                }
                if (iOrdinal6 == 24) {
                    w76.m12156c("EXPRESSION_LIST", 1, arrayList);
                    do5Var = aq5.f14781np;
                    while (i < arrayList.size()) {
                        aq5 aq5VarM13122t29 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(i));
                        if (aq5VarM13122t29 instanceof po5) {
                            C1077qn.m9989o("ControlValue cannot be in an expression list");
                            return null;
                        }
                        i++;
                        do5Var = aq5VarM13122t29;
                    }
                } else {
                    if (iOrdinal6 == 33) {
                        w76.m12154a("GET", 1, arrayList);
                        aq5 aq5VarM13122t30 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0));
                        if (aq5VarM13122t30 instanceof sq5) {
                            return r36Var.m10200l(((sq5) aq5VarM13122t30).f30510a);
                        }
                        C1077qn.m9987m(zi4.m13620t("Expected string for get var. got ", aq5VarM13122t30.getClass().getCanonicalName()));
                        return null;
                    }
                    if (iOrdinal6 == 49) {
                        w76.m12154a("NULL", 0, arrayList);
                        return aq5.f14782op;
                    }
                    if (iOrdinal6 == 58) {
                        w76.m12154a("SET_PROPERTY", 3, arrayList);
                        aq5 aq5Var14 = (aq5) arrayList.get(0);
                        yg3 yg3Var13 = (yg3) r36Var.f28986b;
                        yg3 yg3Var14 = (yg3) r36Var.f28986b;
                        aq5 aq5VarM13122t31 = yg3Var13.m13122t(r36Var, aq5Var14);
                        aq5 aq5VarM13122t32 = yg3Var14.m13122t(r36Var, (aq5) arrayList.get(1));
                        aq5 aq5VarM13122t33 = yg3Var14.m13122t(r36Var, (aq5) arrayList.get(2));
                        if (aq5VarM13122t31 == aq5.f14781np || aq5VarM13122t31 == aq5.f14782op) {
                            C1077qn.m9989o(c75.m3879k("Can't set property ", aq5VarM13122t32.mo3117h(), " of ", aq5VarM13122t31.mo3117h()));
                            return null;
                        }
                        if ((aq5VarM13122t31 instanceof do5) && (aq5VarM13122t32 instanceof xo5)) {
                            ((do5) aq5VarM13122t31).m4630v(((xo5) aq5VarM13122t32).f34512a.intValue(), aq5VarM13122t33);
                        } else if (aq5VarM13122t31 instanceof ip5) {
                            ((ip5) aq5VarM13122t31).mo4623c(aq5VarM13122t32.mo3117h(), aq5VarM13122t33);
                        }
                        return aq5VarM13122t33;
                    }
                    if (iOrdinal6 != 17) {
                        if (iOrdinal6 != 18) {
                            if (iOrdinal6 == 35 || iOrdinal6 == 36) {
                                w76.m12154a("GET_PROPERTY", 2, arrayList);
                                aq5 aq5VarM13122t34 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0));
                                aq5 aq5VarM13122t35 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(1));
                                if ((aq5VarM13122t34 instanceof do5) && w76.m12159f(aq5VarM13122t35)) {
                                    return ((do5) aq5VarM13122t34).m4629u(aq5VarM13122t35.mo3119m().intValue());
                                }
                                if (aq5VarM13122t34 instanceof ip5) {
                                    return ((ip5) aq5VarM13122t34).mo4624d(aq5VarM13122t35.mo3117h());
                                }
                                if (aq5VarM13122t34 instanceof sq5) {
                                    if ("length".equals(aq5VarM13122t35.mo3117h())) {
                                        return new xo5(Double.valueOf(((sq5) aq5VarM13122t34).f30510a.length()));
                                    }
                                    if (w76.m12159f(aq5VarM13122t35)) {
                                        double dDoubleValue = aq5VarM13122t35.mo3119m().doubleValue();
                                        String str12 = ((sq5) aq5VarM13122t34).f30510a;
                                        if (dDoubleValue < str12.length()) {
                                            return new sq5(String.valueOf(str12.charAt(aq5VarM13122t35.mo3119m().intValue())));
                                        }
                                    }
                                }
                                return aq5.f14781np;
                            }
                            switch (iOrdinal6) {
                                case 62:
                                    w76.m12154a("TYPEOF", 1, arrayList);
                                    aq5 aq5VarM13122t36 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0));
                                    if (aq5VarM13122t36 instanceof vq5) {
                                        str2 = "undefined";
                                    } else if (aq5VarM13122t36 instanceof jo5) {
                                        str2 = "boolean";
                                    } else if (aq5VarM13122t36 instanceof xo5) {
                                        str2 = "number";
                                    } else if (aq5VarM13122t36 instanceof sq5) {
                                        str2 = "string";
                                    } else if (aq5VarM13122t36 instanceof vp5) {
                                        str2 = "function";
                                    } else {
                                        if ((aq5VarM13122t36 instanceof dq5) || (aq5VarM13122t36 instanceof po5)) {
                                            throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", aq5VarM13122t36));
                                        }
                                        str2 = "object";
                                    }
                                    return new sq5(str2);
                                case 63:
                                    w76.m12154a("UNDEFINED", 0, arrayList);
                                    return aq5.f14781np;
                                case 64:
                                    w76.m12156c("VAR", 1, arrayList);
                                    int size = arrayList.size();
                                    while (i < size) {
                                        Object obj = arrayList.get(i);
                                        i++;
                                        aq5 aq5VarM13122t37 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) obj);
                                        if (!(aq5VarM13122t37 instanceof sq5)) {
                                            C1077qn.m9987m(zi4.m13620t("Expected string for var name. got ", aq5VarM13122t37.getClass().getCanonicalName()));
                                            return null;
                                        }
                                        r36Var.m10199k(((sq5) aq5VarM13122t37).f30510a, aq5.f14781np);
                                    }
                                    return aq5.f14781np;
                                default:
                                    m13728b(str);
                                    throw null;
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return new mp5();
                        }
                        if (arrayList.size() % 2 != 0) {
                            C1077qn.m9987m(c75.m3877i(arrayList.size(), "CREATE_OBJECT requires an even number of arguments, found "));
                            return null;
                        }
                        do5Var = new mp5();
                        while (i < arrayList.size() - 1) {
                            aq5 aq5VarM13122t38 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(i));
                            aq5 aq5VarM13122t39 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(i + 1));
                            if ((aq5VarM13122t38 instanceof po5) || (aq5VarM13122t39 instanceof po5)) {
                                C1077qn.m9989o("Failed to evaluate map entry");
                                return null;
                            }
                            do5Var.mo4623c(aq5VarM13122t38.mo3117h(), aq5VarM13122t39);
                            i += 2;
                        }
                    } else {
                        if (arrayList.isEmpty()) {
                            return new do5();
                        }
                        do5Var = new do5();
                        int size2 = arrayList.size();
                        int i5 = 0;
                        while (i5 < size2) {
                            Object obj2 = arrayList.get(i5);
                            i5++;
                            aq5 aq5VarM13122t40 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) obj2);
                            if (aq5VarM13122t40 instanceof po5) {
                                C1077qn.m9989o("Failed to evaluate array element");
                                return null;
                            }
                            do5Var.m4630v(i, aq5VarM13122t40);
                            i++;
                        }
                    }
                }
                return do5Var;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m13728b(String str) {
        if (!this.f36268a.contains(w76.m12160g(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
    }
}
