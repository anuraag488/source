package p000;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xc6 {

    /* JADX INFO: renamed from: c */
    public static final xc6 f34159c = new xc6(100);

    /* JADX INFO: renamed from: a */
    public final EnumMap f34160a;

    /* JADX INFO: renamed from: b */
    public final int f34161b;

    public xc6(int i) {
        EnumMap enumMap = new EnumMap(vc6.class);
        this.f34160a = enumMap;
        vc6 vc6Var = vc6.AD_STORAGE;
        rc6 rc6Var = rc6.UNINITIALIZED;
        enumMap.put(vc6Var, rc6Var);
        enumMap.put(vc6.ANALYTICS_STORAGE, rc6Var);
        this.f34161b = i;
    }

    /* JADX INFO: renamed from: a */
    public static String m12651a(int i) {
        if (i == -30) {
            return "TCF";
        }
        if (i == -20) {
            return "API";
        }
        if (i == -10) {
            return "MANIFEST";
        }
        if (i == 0) {
            return "1P_API";
        }
        if (i == 30) {
            return "1P_INIT";
        }
        if (i != 90) {
            return i != 100 ? "OTHER" : "UNKNOWN";
        }
        return "REMOTE_CONFIG";
    }

    /* JADX INFO: renamed from: b */
    public static xc6 m12652b(int i, Bundle bundle) {
        if (bundle == null) {
            return new xc6(i);
        }
        EnumMap enumMap = new EnumMap(vc6.class);
        for (vc6 vc6Var : tc6.STORAGE.f31080a) {
            enumMap.put(vc6Var, m12654d(bundle.getString(vc6Var.f32527a)));
        }
        return new xc6(enumMap, i);
    }

    /* JADX INFO: renamed from: c */
    public static xc6 m12653c(int i, String str) {
        EnumMap enumMap = new EnumMap(vc6.class);
        vc6[] vc6VarArr = tc6.STORAGE.f31080a;
        for (int i2 = 0; i2 < vc6VarArr.length; i2++) {
            String str2 = str == null ? "" : str;
            vc6 vc6Var = vc6VarArr[i2];
            int i3 = i2 + 2;
            if (i3 < str2.length()) {
                enumMap.put(vc6Var, m12655e(str2.charAt(i3)));
            } else {
                enumMap.put(vc6Var, rc6.UNINITIALIZED);
            }
        }
        return new xc6(enumMap, i);
    }

    /* JADX INFO: renamed from: d */
    public static rc6 m12654d(String str) {
        rc6 rc6Var = rc6.UNINITIALIZED;
        if (str == null) {
            return rc6Var;
        }
        if (str.equals("granted")) {
            return rc6.GRANTED;
        }
        return str.equals("denied") ? rc6.DENIED : rc6Var;
    }

    /* JADX INFO: renamed from: e */
    public static rc6 m12655e(char c) {
        if (c == '+') {
            return rc6.POLICY;
        }
        if (c != '0') {
            return c != '1' ? rc6.UNINITIALIZED : rc6.GRANTED;
        }
        return rc6.DENIED;
    }

    /* JADX INFO: renamed from: h */
    public static char m12656h(rc6 rc6Var) {
        if (rc6Var == null) {
            return '-';
        }
        int iOrdinal = rc6Var.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    /* JADX INFO: renamed from: l */
    public static boolean m12657l(int i, int i2) {
        int i3 = -30;
        if (i == -20) {
            if (i2 == -30) {
                return true;
            }
            i = -20;
        }
        if (i != -30) {
            i3 = i;
        } else if (i2 == -20) {
            return true;
        }
        return i3 == i2 || i < i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xc6) {
            xc6 xc6Var = (xc6) obj;
            for (vc6 vc6Var : tc6.STORAGE.f31080a) {
                if (this.f34160a.get(vc6Var) == xc6Var.f34160a.get(vc6Var)) {
                }
            }
            if (this.f34161b == xc6Var.f34161b) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    /* JADX INFO: renamed from: f */
    public final String m12658f() {
        int iOrdinal;
        StringBuilder sb = new StringBuilder("G1");
        for (vc6 vc6Var : tc6.STORAGE.f31080a) {
            rc6 rc6Var = (rc6) this.f34160a.get(vc6Var);
            char c = '-';
            if (rc6Var != null && (iOrdinal = rc6Var.ordinal()) != 0) {
                if (iOrdinal == 1) {
                    c = '1';
                } else if (iOrdinal == 2) {
                    c = '0';
                } else if (iOrdinal == 3) {
                    c = '1';
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: g */
    public final String m12659g() {
        StringBuilder sb = new StringBuilder("G1");
        for (vc6 vc6Var : tc6.STORAGE.f31080a) {
            sb.append(m12656h((rc6) this.f34160a.get(vc6Var)));
        }
        return sb.toString();
    }

    public final int hashCode() {
        Iterator it = this.f34160a.values().iterator();
        int iHashCode = this.f34161b * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((rc6) it.next()).hashCode();
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m12660i(vc6 vc6Var) {
        return ((rc6) this.f34160a.get(vc6Var)) != rc6.DENIED;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX INFO: renamed from: j */
    public final xc6 m12661j(xc6 xc6Var) {
        EnumMap enumMap = new EnumMap(vc6.class);
        for (vc6 vc6Var : tc6.STORAGE.f31080a) {
            rc6 rc6Var = (rc6) this.f34160a.get(vc6Var);
            rc6 rc6Var2 = (rc6) xc6Var.f34160a.get(vc6Var);
            if (rc6Var == null) {
                rc6Var = rc6Var2;
            } else if (rc6Var2 != null) {
                rc6 rc6Var3 = rc6.UNINITIALIZED;
                if (rc6Var == rc6Var3) {
                    rc6Var = rc6Var2;
                } else if (rc6Var2 != rc6Var3) {
                    rc6 rc6Var4 = rc6.POLICY;
                    if (rc6Var == rc6Var4) {
                        rc6Var = rc6Var2;
                    } else if (rc6Var2 != rc6Var4) {
                        rc6 rc6Var5 = rc6.DENIED;
                        rc6Var = (rc6Var == rc6Var5 || rc6Var2 == rc6Var5) ? rc6Var5 : rc6.GRANTED;
                    }
                }
            }
            if (rc6Var != null) {
                enumMap.put(vc6Var, rc6Var);
            }
        }
        return new xc6(enumMap, 100);
    }

    /* JADX INFO: renamed from: k */
    public final xc6 m12662k(xc6 xc6Var) {
        EnumMap enumMap = new EnumMap(vc6.class);
        for (vc6 vc6Var : tc6.STORAGE.f31080a) {
            rc6 rc6Var = (rc6) this.f34160a.get(vc6Var);
            if (rc6Var == rc6.UNINITIALIZED) {
                rc6Var = (rc6) xc6Var.f34160a.get(vc6Var);
            }
            if (rc6Var != null) {
                enumMap.put(vc6Var, rc6Var);
            }
        }
        return new xc6(enumMap, this.f34161b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(m12651a(this.f34161b));
        for (vc6 vc6Var : tc6.STORAGE.f31080a) {
            sb.append(",");
            sb.append(vc6Var.f32527a);
            sb.append("=");
            rc6 rc6Var = (rc6) this.f34160a.get(vc6Var);
            if (rc6Var == null) {
                rc6Var = rc6.UNINITIALIZED;
            }
            sb.append(rc6Var);
        }
        return sb.toString();
    }

    public xc6(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(vc6.class);
        this.f34160a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f34161b = i;
    }
}
