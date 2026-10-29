package p000;

import ads_mobile_sdk.C0282p9;
import android.os.Message;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vl1 implements Comparator {

    /* JADX INFO: renamed from: b */
    public static final vl1 f32715b = new vl1(0);

    /* JADX INFO: renamed from: c */
    public static final vl1 f32716c = new vl1(1);

    /* JADX INFO: renamed from: d */
    public static final vl1 f32717d = new vl1(2);

    /* JADX INFO: renamed from: e */
    public static final vl1 f32718e = new vl1(3);

    /* JADX INFO: renamed from: f */
    public static final vl1 f32719f = new vl1(4);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f32720a;

    public /* synthetic */ vl1(byte b) {
        this.f32720a = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f32720a) {
            case 0:
                sl1 sl1Var = (sl1) obj;
                sl1 sl1Var2 = (sl1) obj2;
                if (zy5.m13851O(sl1Var) && zy5.m13851O(sl1Var2)) {
                    wf2 wf2VarM10652X = sc6.m10652X(sl1Var);
                    wf2 wf2VarM10652X2 = sc6.m10652X(sl1Var2);
                    if (!z62.m13387o(wf2VarM10652X, wf2VarM10652X2)) {
                        Object[] objArr = new wf2[16];
                        int i = 0;
                        while (wf2VarM10652X != null) {
                            int i2 = i + 1;
                            if (objArr.length < i2) {
                                int length = objArr.length;
                                Object[] objArr2 = new Object[Math.max(i2, length * 2)];
                                System.arraycopy(objArr, 0, objArr2, 0, length);
                                objArr = objArr2;
                            }
                            if (i != 0) {
                                System.arraycopy(objArr, 0, objArr, 0 + 1, i + 0);
                            }
                            objArr[0] = wf2VarM10652X;
                            i++;
                            wf2VarM10652X = wf2VarM10652X.m12295v();
                        }
                        Object[] objArr3 = new wf2[16];
                        int i3 = 0;
                        while (wf2VarM10652X2 != null) {
                            int i4 = i3 + 1;
                            if (objArr3.length < i4) {
                                int length2 = objArr3.length;
                                Object[] objArr4 = new Object[Math.max(i4, length2 * 2)];
                                System.arraycopy(objArr3, 0, objArr4, 0, length2);
                                objArr3 = objArr4;
                            }
                            if (i3 != 0) {
                                System.arraycopy(objArr3, 0, objArr3, 0 + 1, i3 + 0);
                            }
                            objArr3[0] = wf2VarM10652X2;
                            i3++;
                            wf2VarM10652X2 = wf2VarM10652X2.m12295v();
                        }
                        int iMin = Math.min(i - 1, i3 - 1);
                        if (iMin >= 0) {
                            int i5 = 0;
                            while (z62.m13387o(objArr[i5], objArr3[i5])) {
                                if (i5 != iMin) {
                                    i5++;
                                }
                            }
                            return z62.m13393u(((wf2) objArr[i5]).m12296w(), ((wf2) objArr3[i5]).m12296w());
                        }
                        C1077qn.m9989o("Could not find a common ancestor between the two FocusModifiers.");
                    }
                } else {
                    if (zy5.m13851O(sl1Var)) {
                        return -1;
                    }
                    if (zy5.m13851O(sl1Var2)) {
                        return 1;
                    }
                }
                return 0;
            case 1:
                jl3 jl3VarM6547h = ((i14) obj).m6547h();
                jl3 jl3VarM6547h2 = ((i14) obj2).m6547h();
                int iCompare = Float.compare(jl3VarM6547h.f22396a, jl3VarM6547h2.f22396a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(jl3VarM6547h.f22397b, jl3VarM6547h2.f22397b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(jl3VarM6547h.f22399d, jl3VarM6547h2.f22399d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(jl3VarM6547h.f22398c, jl3VarM6547h2.f22398c);
            case 2:
                wf2 wf2Var = (wf2) obj;
                wf2 wf2Var2 = (wf2) obj2;
                int iM13393u = z62.m13393u(wf2Var2.f33327q, wf2Var.f33327q);
                return iM13393u != 0 ? iM13393u : z62.m13393u(wf2Var.hashCode(), wf2Var2.hashCode());
            case 3:
                jl3 jl3VarM6547h3 = ((i14) obj).m6547h();
                jl3 jl3VarM6547h4 = ((i14) obj2).m6547h();
                int iCompare4 = Float.compare(jl3VarM6547h4.f22398c, jl3VarM6547h3.f22398c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(jl3VarM6547h3.f22397b, jl3VarM6547h4.f22397b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(jl3VarM6547h3.f22399d, jl3VarM6547h4.f22399d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(jl3VarM6547h4.f22396a, jl3VarM6547h3.f22396a);
            case 4:
                l73 l73Var = (l73) obj;
                l73 l73Var2 = (l73) obj2;
                int iCompare7 = Float.compare(((jl3) l73Var.f23833a).f22397b, ((jl3) l73Var2.f23833a).f22397b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((jl3) l73Var.f23833a).f22399d, ((jl3) l73Var2.f23833a).f22399d);
            case 5:
                return Integer.valueOf(((C0838kk) obj).f23187b).compareTo(Integer.valueOf(((C0838kk) obj2).f23187b));
            case 6:
                return Integer.valueOf(((C0838kk) obj).f23187b).compareTo(Integer.valueOf(((C0838kk) obj2).f23187b));
            case 7:
                return i41.m6644c(((C1112rl) obj2).f29386b).compareTo(i41.m6644c(((C1112rl) obj).f29386b));
            case 8:
                String strM12941I = y62.m12941I((C0766im) obj);
                Locale locale = Locale.ROOT;
                return strM12941I.toLowerCase(locale).compareTo(y62.m12941I((C0766im) obj2).toLowerCase(locale));
            case 9:
                String strM12941I2 = y62.m12941I((C0766im) obj);
                Locale locale2 = Locale.ROOT;
                return strM12941I2.toLowerCase(locale2).compareTo(y62.m12941I((C0766im) obj2).toLowerCase(locale2));
            case 10:
                String str = (String) obj;
                String str2 = (String) obj2;
                int iMin2 = Math.min(str.length(), str2.length());
                for (int i6 = 4; i6 < iMin2; i6++) {
                    char cCharAt = str.charAt(i6);
                    char cCharAt2 = str2.charAt(i6);
                    if (cCharAt != cCharAt2) {
                        if (z62.m13393u(cCharAt, cCharAt2) >= 0) {
                            return 1;
                        }
                        return -1;
                    }
                }
                int length3 = str.length();
                int length4 = str2.length();
                if (length3 == length4) {
                    return 0;
                }
                if (length3 >= length4) {
                    return 1;
                }
                return -1;
            case 11:
                String title = ((pn0) ((l73) obj).f23834b).getTitle();
                Locale locale3 = Locale.ROOT;
                return title.toLowerCase(locale3).compareTo(((pn0) ((l73) obj2).f23834b).getTitle().toLowerCase(locale3));
            case 12:
                wf2 wf2Var3 = (wf2) obj;
                wf2 wf2Var4 = (wf2) obj2;
                int iM13393u2 = z62.m13393u(wf2Var3.f33327q, wf2Var4.f33327q);
                return iM13393u2 != 0 ? iM13393u2 : z62.m13393u(wf2Var3.hashCode(), wf2Var4.hashCode());
            case 13:
                return Float.valueOf(((a11) obj).f34a).compareTo(Float.valueOf(((a11) obj2).f34a));
            case 14:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 15:
                return qs5.m10111p((qi3) obj, (qi3) obj2);
            case 16:
                return qs5.m10111p((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 17:
                return qs5.m10111p((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 18:
                return Double.valueOf(((rw3) obj2).f29688b).compareTo(Double.valueOf(((rw3) obj).f29688b));
            case 19:
                return Long.valueOf(((xw3) obj2).f34670b).compareTo(Long.valueOf(((xw3) obj).f34670b));
            case 20:
                return Integer.valueOf(((xw3) obj2).f34671c).compareTo(Integer.valueOf(((xw3) obj).f34671c));
            case 21:
                return Long.valueOf(((Message) obj).getWhen()).compareTo(Long.valueOf(((Message) obj2).getWhen()));
            case 22:
                String str3 = (String) ((l73) obj).f23833a;
                Locale locale4 = Locale.ROOT;
                return str3.toLowerCase(locale4).compareTo(((String) ((l73) obj2).f23833a).toLowerCase(locale4));
            case 23:
                return qs5.m10111p(((i64) obj).f21142b, ((i64) obj2).f21142b);
            case 24:
                return qs5.m10111p(((qh4) obj).f28476a, ((qh4) obj2).f28476a);
            case 25:
                return qs5.m10111p(((sh4) obj).f30278a, ((sh4) obj2).f30278a);
            case 26:
                return qs5.m10111p(String.valueOf(((Boolean) obj).booleanValue()), String.valueOf(((Boolean) obj2).booleanValue()));
            case 27:
                return Long.valueOf(((C0282p9) obj).m1934w()).compareTo(Long.valueOf(((C0282p9) obj2).m1934w()));
            case 28:
                return qs5.m10111p(obj != null ? obj.toString() : null, obj2 != null ? obj2.toString() : null);
            default:
                return qs5.m10111p(obj != null ? obj.toString() : null, obj2 != null ? obj2.toString() : null);
        }
    }
}
