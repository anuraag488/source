package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sq5 implements Iterable, aq5 {

    /* JADX INFO: renamed from: a */
    public final String f30510a;

    public sq5(String str) {
        if (str != null) {
            this.f30510a = str;
        } else {
            C1077qn.m9987m("StringValue cannot be null.");
            throw null;
        }
    }

    @Override // p000.aq5
    /* JADX INFO: renamed from: a */
    public final Boolean mo3116a() {
        return Boolean.valueOf(!this.f30510a.isEmpty());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sq5) {
            return this.f30510a.equals(((sq5) obj).f30510a);
        }
        return false;
    }

    @Override // p000.aq5
    /* JADX INFO: renamed from: h */
    public final String mo3117h() {
        return this.f30510a;
    }

    public final int hashCode() {
        return this.f30510a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        iq5 iq5Var = new iq5((byte) 1);
        iq5Var.f21655c = this;
        iq5Var.f21654b = 0;
        VarHandle.storeStoreFence();
        return iq5Var;
    }

    @Override // p000.aq5
    /* JADX INFO: renamed from: l */
    public final Iterator mo3118l() {
        iq5 iq5Var = new iq5((byte) 0);
        iq5Var.f21655c = this;
        iq5Var.f21654b = 0;
        VarHandle.storeStoreFence();
        return iq5Var;
    }

    @Override // p000.aq5
    /* JADX INFO: renamed from: m */
    public final Double mo3119m() {
        String str = this.f30510a;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x02e4 A[PHI: r8
  0x02e4: PHI (r8v6 boolean) = (r8v12 boolean), (r8v13 boolean), (r8v16 boolean) binds: [B:100:0x02d0, B:101:0x02d2, B:103:0x02e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.aq5
    /* JADX INFO: renamed from: q */
    public final aq5 mo3120q(String str, r36 r36Var, ArrayList arrayList) {
        String str2;
        int i;
        int i2;
        int i3;
        boolean zIsEmpty;
        r36 r36Var2;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "trim";
        } else {
            str2 = "trim";
            if (!str2.equals(str)) {
                C1077qn.m9987m(str.concat(" is not a String function"));
                return null;
            }
        }
        int iHashCode = str.hashCode();
        String strMo3117h = "undefined";
        String str3 = this.f30510a;
        z = false;
        boolean z = false;
        switch (iHashCode) {
            case -1789698943:
                if (str.equals("hasOwnProperty")) {
                    w76.m12154a("hasOwnProperty", 1, arrayList);
                    aq5 aq5VarM13122t = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0));
                    boolean zEquals = "length".equals(aq5VarM13122t.mo3117h());
                    jo5 jo5Var = aq5.f14786sp;
                    if (zEquals) {
                        return jo5Var;
                    }
                    double dDoubleValue = aq5VarM13122t.mo3119m().doubleValue();
                    return (dDoubleValue != Math.floor(dDoubleValue) || (i = (int) dDoubleValue) < 0 || i >= str3.length()) ? aq5.f14787tp : jo5Var;
                }
                C1077qn.m9987m("Command not supported");
                return null;
            case -1776922004:
                if (str.equals("toString")) {
                    w76.m12154a("toString", 0, arrayList);
                    return this;
                }
                C1077qn.m9987m("Command not supported");
                return null;
            case -1464939364:
                if (str.equals("toLocaleLowerCase")) {
                    w76.m12154a("toLocaleLowerCase", 0, arrayList);
                    return new sq5(str3.toLowerCase());
                }
                C1077qn.m9987m("Command not supported");
                return null;
            case -1361633751:
                if (str.equals("charAt")) {
                    w76.m12158e("charAt", 1, arrayList);
                    int iM12163j = arrayList.isEmpty() ? 0 : (int) w76.m12163j(((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0)).mo3119m().doubleValue());
                    return (iM12163j < 0 || iM12163j >= str3.length()) ? aq5.f14788up : new sq5(String.valueOf(str3.charAt(iM12163j)));
                }
                C1077qn.m9987m("Command not supported");
                return null;
            case -1354795244:
                if (str.equals("concat")) {
                    if (!arrayList.isEmpty()) {
                        StringBuilder sb = new StringBuilder(str3);
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            sb.append(((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(i4)).mo3117h());
                        }
                        return new sq5(sb.toString());
                    }
                    return this;
                }
                C1077qn.m9987m("Command not supported");
                return null;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    w76.m12154a("toLowerCase", 0, arrayList);
                    return new sq5(str3.toLowerCase(Locale.ENGLISH));
                }
                C1077qn.m9987m("Command not supported");
                return null;
            case -906336856:
                if (str.equals("search")) {
                    w76.m12158e("search", 1, arrayList);
                    Matcher matcher = Pattern.compile(arrayList.isEmpty() ? "undefined" : ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0)).mo3117h()).matcher(str3);
                    return matcher.find() ? new xo5(Double.valueOf(matcher.start())) : new xo5(Double.valueOf(-1.0d));
                }
                C1077qn.m9987m("Command not supported");
                return null;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    w76.m12154a("toLocaleUpperCase", 0, arrayList);
                    return new sq5(str3.toUpperCase());
                }
                C1077qn.m9987m("Command not supported");
                return null;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    w76.m12158e("lastIndexOf", 2, arrayList);
                    String strMo3117h2 = arrayList.size() > 0 ? ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0)).mo3117h() : "undefined";
                    double dDoubleValue2 = arrayList.size() < 2 ? Double.NaN : ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(1)).mo3119m().doubleValue();
                    return new xo5(Double.valueOf(str3.lastIndexOf(strMo3117h2, (int) (Double.isNaN(dDoubleValue2) ? Double.POSITIVE_INFINITY : w76.m12163j(dDoubleValue2)))));
                }
                C1077qn.m9987m("Command not supported");
                return null;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    w76.m12154a("toUpperCase", 0, arrayList);
                    return new sq5(str3.toUpperCase(Locale.ENGLISH));
                }
                C1077qn.m9987m("Command not supported");
                return null;
            case 3568674:
                if (str.equals(str2)) {
                    w76.m12154a("toUpperCase", 0, arrayList);
                    return new sq5(str3.trim());
                }
                C1077qn.m9987m("Command not supported");
                return null;
            case 103668165:
                if (str.equals("match")) {
                    w76.m12158e("match", 1, arrayList);
                    Matcher matcher2 = Pattern.compile(arrayList.size() <= 0 ? "" : ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0)).mo3117h()).matcher(str3);
                    return matcher2.find() ? new do5(Arrays.asList(new sq5(matcher2.group()))) : aq5.f14782op;
                }
                C1077qn.m9987m("Command not supported");
                return null;
            case 109526418:
                if (str.equals("slice")) {
                    w76.m12158e("slice", 2, arrayList);
                    double dM12163j = w76.m12163j(!arrayList.isEmpty() ? ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0)).mo3119m().doubleValue() : 0.0d);
                    double dMax = dM12163j < 0.0d ? Math.max(((double) str3.length()) + dM12163j, 0.0d) : Math.min(dM12163j, str3.length());
                    double dM12163j2 = w76.m12163j(arrayList.size() > 1 ? ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(1)).mo3119m().doubleValue() : str3.length());
                    int i5 = (int) dMax;
                    return new sq5(str3.substring(i5, Math.max(0, ((int) (dM12163j2 < 0.0d ? Math.max(((double) str3.length()) + dM12163j2, 0.0d) : Math.min(dM12163j2, str3.length()))) - i5) + i5));
                }
                C1077qn.m9987m("Command not supported");
                return null;
            case 109648666:
                if (str.equals("split")) {
                    w76.m12158e("split", 2, arrayList);
                    if (str3.length() == 0) {
                        return new do5(Arrays.asList(this));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (arrayList.isEmpty()) {
                        arrayList2.add(this);
                    } else {
                        String strMo3117h3 = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0)).mo3117h();
                        long jM12162i = arrayList.size() > 1 ? ((long) w76.m12162i(((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(1)).mo3119m().doubleValue())) & 4294967295L : 2147483647L;
                        if (jM12162i == 0) {
                            return new do5();
                        }
                        String[] strArrSplit = str3.split(Pattern.quote(strMo3117h3), ((int) jM12162i) + 1);
                        int length = strArrSplit.length;
                        if (!strMo3117h3.isEmpty() || length <= 0) {
                            i3 = zIsEmpty;
                            z = zIsEmpty;
                            i2 = length;
                            i3 = z;
                        } else {
                            zIsEmpty = strArrSplit[0].isEmpty();
                            i2 = length - 1;
                            if (!strArrSplit[i2].isEmpty()) {
                                i3 = zIsEmpty;
                                z = zIsEmpty;
                                i2 = length;
                                i3 = z;
                            }
                        }
                        i3 = zIsEmpty;
                        z = zIsEmpty;
                        if (length > jM12162i) {
                            i2--;
                        }
                        while (i3 < i2) {
                            arrayList2.add(new sq5(strArrSplit[i3]));
                            i3++;
                        }
                    }
                    return new do5(arrayList2);
                }
                C1077qn.m9987m("Command not supported");
                return null;
            case 530542161:
                if (str.equals("substring")) {
                    w76.m12158e("substring", 2, arrayList);
                    int iM12163j2 = !arrayList.isEmpty() ? (int) w76.m12163j(((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0)).mo3119m().doubleValue()) : 0;
                    int iM12163j3 = arrayList.size() > 1 ? (int) w76.m12163j(((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(1)).mo3119m().doubleValue()) : str3.length();
                    int iMin = Math.min(Math.max(iM12163j2, 0), str3.length());
                    int iMin2 = Math.min(Math.max(iM12163j3, 0), str3.length());
                    return new sq5(str3.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
                }
                C1077qn.m9987m("Command not supported");
                return null;
            case 1094496948:
                if (str.equals("replace")) {
                    w76.m12158e("replace", 2, arrayList);
                    boolean zIsEmpty2 = arrayList.isEmpty();
                    aq5 aq5VarMo4517f = aq5.f14781np;
                    if (!zIsEmpty2) {
                        strMo3117h = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(0)).mo3117h();
                        if (arrayList.size() > 1) {
                            aq5VarMo4517f = ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) arrayList.get(1));
                        }
                    }
                    String str4 = strMo3117h;
                    int iIndexOf = str3.indexOf(str4);
                    if (iIndexOf >= 0) {
                        if (aq5VarMo4517f instanceof dp5) {
                            aq5VarMo4517f = ((dp5) aq5VarMo4517f).mo4517f(r36Var, Arrays.asList(new sq5(str4), new xo5(Double.valueOf(iIndexOf)), this));
                        }
                        String strSubstring = str3.substring(0, iIndexOf);
                        String strMo3117h4 = aq5VarMo4517f.mo3117h();
                        String strSubstring2 = str3.substring(str4.length() + iIndexOf);
                        return new sq5(c75.m3881m(new StringBuilder(strSubstring.length() + String.valueOf(strMo3117h4).length() + strSubstring2.length()), strSubstring, strMo3117h4, strSubstring2));
                    }
                    return this;
                }
                C1077qn.m9987m("Command not supported");
                return null;
            case 1943291465:
                if (str.equals("indexOf")) {
                    w76.m12158e("indexOf", 2, arrayList);
                    if (arrayList.size() <= 0) {
                        r36Var2 = r36Var;
                    } else {
                        r36Var2 = r36Var;
                        strMo3117h = ((yg3) r36Var2.f28986b).m13122t(r36Var2, (aq5) arrayList.get(0)).mo3117h();
                    }
                    return new xo5(Double.valueOf(str3.indexOf(strMo3117h, (int) w76.m12163j(arrayList.size() < 2 ? 0.0d : ((yg3) r36Var2.f28986b).m13122t(r36Var2, (aq5) arrayList.get(1)).mo3119m().doubleValue()))));
                }
                C1077qn.m9987m("Command not supported");
                return null;
            default:
                C1077qn.m9987m("Command not supported");
                return null;
        }
    }

    @Override // p000.aq5
    /* JADX INFO: renamed from: r */
    public final aq5 mo3121r() {
        return new sq5(this.f30510a);
    }

    public final String toString() {
        String str = this.f30510a;
        return c75.m3881m(new StringBuilder(str.length() + 2), "\"", str, "\"");
    }
}
