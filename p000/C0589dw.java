package p000;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: renamed from: dw */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0589dw implements bo1 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f17434a;

    /* JADX INFO: renamed from: b */
    public int f17435b;

    /* JADX INFO: renamed from: c */
    public int f17436c;

    /* JADX INFO: renamed from: d */
    public int f17437d;

    /* JADX INFO: renamed from: e */
    public int f17438e;

    /* JADX INFO: renamed from: f */
    public int f17439f;

    /* JADX INFO: renamed from: g */
    public boolean f17440g;

    /* JADX INFO: renamed from: h */
    public String f17441h;

    /* JADX INFO: renamed from: i */
    public int f17442i;

    /* JADX INFO: renamed from: j */
    public CharSequence f17443j;

    /* JADX INFO: renamed from: k */
    public int f17444k;

    /* JADX INFO: renamed from: l */
    public CharSequence f17445l;

    /* JADX INFO: renamed from: m */
    public ArrayList f17446m;

    /* JADX INFO: renamed from: n */
    public ArrayList f17447n;

    /* JADX INFO: renamed from: o */
    public boolean f17448o;

    /* JADX INFO: renamed from: p */
    public ArrayList f17449p;

    /* JADX INFO: renamed from: q */
    public final eo1 f17450q;

    /* JADX INFO: renamed from: r */
    public boolean f17451r;

    /* JADX INFO: renamed from: s */
    public int f17452s;

    public C0589dw(eo1 eo1Var) {
        eo1Var.m5222G();
        rn1 rn1Var = eo1Var.f18326w;
        if (rn1Var != null) {
            rn1Var.f29431v.getClassLoader();
        }
        this.f17434a = new ArrayList();
        this.f17448o = false;
        this.f17452s = -1;
        this.f17450q = eo1Var;
    }

    @Override // p000.bo1
    /* JADX INFO: renamed from: a */
    public final boolean mo3642a(ArrayList arrayList, ArrayList arrayList2) {
        if (eo1.m5212J(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f17440g) {
            return true;
        }
        this.f17450q.f18307d.add(this);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m4766b(po1 po1Var) {
        this.f17434a.add(po1Var);
        po1Var.f27854d = this.f17435b;
        po1Var.f27855e = this.f17436c;
        po1Var.f27856f = this.f17437d;
        po1Var.f27857g = this.f17438e;
    }

    /* JADX INFO: renamed from: c */
    public final void m4767c(int i) {
        if (this.f17440g) {
            if (eo1.m5212J(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f17434a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                po1 po1Var = (po1) arrayList.get(i2);
                pn1 pn1Var = po1Var.f27852b;
                if (pn1Var != null) {
                    pn1Var.f27796s += i;
                    if (eo1.m5212J(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + po1Var.f27852b + " to " + po1Var.f27852b.f27796s);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4768d() {
        ArrayList arrayList = this.f17434a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            po1 po1Var = (po1) arrayList.get(size);
            if (po1Var.f27853c) {
                if (po1Var.f27851a == 8) {
                    po1Var.f27853c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i = po1Var.f27852b.f27802y;
                    po1Var.f27851a = 2;
                    po1Var.f27853c = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        po1 po1Var2 = (po1) arrayList.get(i2);
                        if (po1Var2.f27853c && po1Var2.f27852b.f27802y == i) {
                            arrayList.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m4769e(boolean z, boolean z2) {
        if (this.f17451r) {
            C1077qn.m9989o("commit already called");
            return 0;
        }
        if (eo1.m5212J(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new qn2());
            m4771g("  ", printWriter, true);
            printWriter.close();
        }
        this.f17451r = true;
        boolean z3 = this.f17440g;
        eo1 eo1Var = this.f17450q;
        if (z3) {
            this.f17452s = eo1Var.f18314k.getAndIncrement();
        } else {
            this.f17452s = -1;
        }
        if (z2) {
            eo1Var.m5266y(this, z);
        }
        return this.f17452s;
    }

    /* JADX INFO: renamed from: f */
    public final void m4770f(int i, pn1 pn1Var, String str) {
        String str2 = pn1Var.f27767L;
        if (str2 != null) {
            oo1.m9220c(pn1Var, str2);
        }
        Class<?> cls = pn1Var.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = pn1Var.f27803z;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(pn1Var);
                sb.append(": was ");
                C1077qn.m9989o(c75.m3881m(sb, pn1Var.f27803z, " now ", str));
                return;
            }
            pn1Var.f27803z = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + pn1Var + " with tag " + str + " to container view with no id");
            }
            int i2 = pn1Var.f27801x;
            if (i2 != 0 && i2 != i) {
                StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                sb2.append(pn1Var);
                int i3 = pn1Var.f27801x;
                sb2.append(": was ");
                sb2.append(i3);
                sb2.append(" now ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
            pn1Var.f27801x = i;
            pn1Var.f27802y = i;
        }
        m4766b(new po1(1, pn1Var));
        pn1Var.f27797t = this.f17450q;
    }

    /* JADX INFO: renamed from: g */
    public final void m4771g(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f17441h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f17452s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f17451r);
            if (this.f17439f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f17439f));
            }
            if (this.f17435b != 0 || this.f17436c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f17435b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f17436c));
            }
            if (this.f17437d != 0 || this.f17438e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f17437d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f17438e));
            }
            if (this.f17442i != 0 || this.f17443j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f17442i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f17443j);
            }
            if (this.f17444k != 0 || this.f17445l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f17444k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f17445l);
            }
        }
        ArrayList arrayList = this.f17434a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            po1 po1Var = (po1) arrayList.get(i);
            switch (po1Var.f27851a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + po1Var.f27851a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(po1Var.f27852b);
            if (z) {
                if (po1Var.f27854d != 0 || po1Var.f27855e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(po1Var.f27854d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(po1Var.f27855e));
                }
                if (po1Var.f27856f != 0 || po1Var.f27857g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(po1Var.f27856f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(po1Var.f27857g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f17452s >= 0) {
            sb.append(" #");
            sb.append(this.f17452s);
        }
        if (this.f17441h != null) {
            sb.append(" ");
            sb.append(this.f17441h);
        }
        sb.append("}");
        return sb.toString();
    }
}
