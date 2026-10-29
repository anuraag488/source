package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class w76 {
    /* JADX INFO: renamed from: a */
    public static void m12154a(String str, int i, List list) {
        if (list.size() == i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i + " parameters found " + list.size());
    }

    /* JADX INFO: renamed from: b */
    public static aq5 m12155b(do5 do5Var, r36 r36Var, ArrayList arrayList, boolean z) {
        aq5 aq5VarMo4517f;
        m12156c("reduce", 1, arrayList);
        m12158e("reduce", 2, arrayList);
        aq5 aq5VarM13122t = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0));
        if (!(aq5VarM13122t instanceof dp5)) {
            C1077qn.m9987m("Callback should be a method");
            return null;
        }
        if (arrayList.size() == 2) {
            aq5VarMo4517f = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(1));
            if (aq5VarMo4517f instanceof po5) {
                C1077qn.m9987m("Failed to parse initial value");
                return null;
            }
        } else {
            if (do5Var.m4628t() == 0) {
                C1077qn.m9989o("Empty array with no initial value error");
                return null;
            }
            aq5VarMo4517f = null;
        }
        dp5 dp5Var = (dp5) aq5VarM13122t;
        int iM4628t = do5Var.m4628t();
        int i = z ? 0 : iM4628t - 1;
        int i2 = z ? iM4628t - 1 : 0;
        int i3 = true == z ? 1 : -1;
        if (aq5VarMo4517f == null) {
            aq5VarMo4517f = do5Var.m4629u(i);
            i += i3;
        }
        while ((i2 - i) * i3 >= 0) {
            if (do5Var.m4631w(i)) {
                aq5VarMo4517f = dp5Var.mo4517f(r36Var, Arrays.asList(aq5VarMo4517f, do5Var.m4629u(i), new xo5(Double.valueOf(i)), do5Var));
                if (aq5VarMo4517f instanceof po5) {
                    C1077qn.m9989o("Reduce operation failed");
                    return null;
                }
                i += i3;
            } else {
                i += i3;
            }
        }
        return aq5VarMo4517f;
    }

    /* JADX INFO: renamed from: c */
    public static void m12156c(String str, int i, List list) {
        if (list.size() >= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at least " + i + " parameters found " + list.size());
    }

    /* JADX INFO: renamed from: d */
    public static do5 m12157d(do5 do5Var, r36 r36Var, vp5 vp5Var, Boolean bool, Boolean bool2) {
        do5 do5Var2 = new do5();
        Iterator itM4627s = do5Var.m4627s();
        while (itM4627s.hasNext()) {
            int iIntValue = ((Integer) itM4627s.next()).intValue();
            if (do5Var.m4631w(iIntValue)) {
                aq5 aq5VarMo4517f = vp5Var.mo4517f(r36Var, Arrays.asList(do5Var.m4629u(iIntValue), new xo5(Double.valueOf(iIntValue)), do5Var));
                if (aq5VarMo4517f.mo3116a().equals(bool)) {
                    break;
                }
                if (bool2 == null || aq5VarMo4517f.mo3116a().equals(bool2)) {
                    do5Var2.m4630v(iIntValue, aq5VarMo4517f);
                }
            }
        }
        return do5Var2;
    }

    /* JADX INFO: renamed from: e */
    public static void m12158e(String str, int i, ArrayList arrayList) {
        if (arrayList.size() <= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at most " + i + " parameters found " + arrayList.size());
    }

    /* JADX INFO: renamed from: f */
    public static boolean m12159f(aq5 aq5Var) {
        if (aq5Var == null) {
            return false;
        }
        Double dMo3119m = aq5Var.mo3119m();
        return !dMo3119m.isNaN() && dMo3119m.doubleValue() >= 0.0d && dMo3119m.equals(Double.valueOf(Math.floor(dMo3119m.doubleValue())));
    }

    /* JADX INFO: renamed from: g */
    public static kt5 m12160g(String str) {
        kt5 kt5Var;
        if (str == null || str.isEmpty()) {
            kt5Var = null;
        } else {
            kt5Var = (kt5) kt5.f23480l0.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (kt5Var != null) {
            return kt5Var;
        }
        C1077qn.m9987m(zi4.m13620t("Unsupported commandId ", str));
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m12161h(aq5 aq5Var, aq5 aq5Var2) {
        if (!aq5Var.getClass().equals(aq5Var2.getClass())) {
            return false;
        }
        if ((aq5Var instanceof vq5) || (aq5Var instanceof rp5)) {
            return true;
        }
        if (aq5Var instanceof xo5) {
            if (Double.isNaN(aq5Var.mo3119m().doubleValue()) || Double.isNaN(aq5Var2.mo3119m().doubleValue())) {
                return false;
            }
            return aq5Var.mo3119m().equals(aq5Var2.mo3119m());
        }
        if (aq5Var instanceof sq5) {
            return aq5Var.mo3117h().equals(aq5Var2.mo3117h());
        }
        if (aq5Var instanceof jo5) {
            return aq5Var.mo3116a().equals(aq5Var2.mo3116a());
        }
        return aq5Var == aq5Var2;
    }

    /* JADX INFO: renamed from: i */
    public static int m12162i(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d))) % 4.294967296E9d);
    }

    /* JADX INFO: renamed from: j */
    public static double m12163j(double d) {
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || d == 0.0d) {
            return d;
        }
        return ((double) (d > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d));
    }

    /* JADX INFO: renamed from: k */
    public static Object m12164k(aq5 aq5Var) {
        if (aq5.f14782op.equals(aq5Var)) {
            return null;
        }
        if (aq5.f14781np.equals(aq5Var)) {
            return "";
        }
        if (aq5Var instanceof mp5) {
            return m12165l((mp5) aq5Var);
        }
        if (!(aq5Var instanceof do5)) {
            return !aq5Var.mo3119m().isNaN() ? aq5Var.mo3119m() : aq5Var.mo3117h();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((do5) aq5Var).iterator();
        while (true) {
            s84 s84Var = (s84) it;
            if (!s84Var.hasNext()) {
                return arrayList;
            }
            Object objM12164k = m12164k((aq5) s84Var.next());
            if (objM12164k != null) {
                arrayList.add(objM12164k);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static HashMap m12165l(mp5 mp5Var) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList(mp5Var.f25119a.keySet());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            Object objM12164k = m12164k(mp5Var.mo4624d(str));
            if (objM12164k != null) {
                map.put(str, objM12164k);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: m */
    public static void m12166m(r36 r36Var) {
        int iM12162i = m12162i(r36Var.m10200l("runtime.counter").mo3119m().doubleValue() + 1.0d);
        if (iM12162i <= 1000000) {
            r36Var.m10198i("runtime.counter", new xo5(Double.valueOf(iM12162i)));
        } else {
            C1077qn.m9989o("Instructions allowed exceeded");
        }
    }
}
