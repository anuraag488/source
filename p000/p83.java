package p000;

import java.io.File;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class p83 implements Comparable {

    /* JADX INFO: renamed from: b */
    public static final String f27431b = File.separator;

    /* JADX INFO: renamed from: a */
    public final s50 f27432a;

    public p83(s50 s50Var) {
        this.f27432a = s50Var;
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m9383a() {
        ArrayList arrayList = new ArrayList();
        int iM4822c = AbstractC0593e.m4822c(this);
        s50 s50Var = this.f27432a;
        if (iM4822c == -1) {
            iM4822c = 0;
        } else if (iM4822c < s50Var.mo4261b() && s50Var.mo4265g(iM4822c) == 92) {
            iM4822c++;
        }
        int iMo4261b = s50Var.mo4261b();
        int i = iM4822c;
        while (iM4822c < iMo4261b) {
            if (s50Var.mo4265g(iM4822c) == 47 || s50Var.mo4265g(iM4822c) == 92) {
                arrayList.add(s50Var.mo4269l(i, iM4822c));
                i = iM4822c + 1;
            }
            iM4822c++;
        }
        if (i < s50Var.mo4261b()) {
            arrayList.add(s50Var.mo4269l(i, s50Var.mo4261b()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final p83 m9384b() {
        s50 s50Var = AbstractC0593e.f17546d;
        s50 s50Var2 = this.f27432a;
        if (z62.m13387o(s50Var2, s50Var)) {
            return null;
        }
        s50 s50Var3 = AbstractC0593e.f17543a;
        if (z62.m13387o(s50Var2, s50Var3)) {
            return null;
        }
        s50 s50Var4 = AbstractC0593e.f17544b;
        if (z62.m13387o(s50Var2, s50Var4)) {
            return null;
        }
        s50 s50Var5 = AbstractC0593e.f17547e;
        int iMo4261b = s50Var2.mo4261b();
        byte[] bArr = s50Var5.f29912a;
        if (s50Var2.mo4268k(iMo4261b - bArr.length, s50Var5, bArr.length) && (s50Var2.mo4261b() == 2 || s50Var2.mo4268k(s50Var2.mo4261b() - 3, s50Var3, 1) || s50Var2.mo4268k(s50Var2.mo4261b() - 3, s50Var4, 1))) {
            return null;
        }
        int iM10521i = s50.m10521i(s50Var2, s50Var3);
        if (iM10521i == -1) {
            iM10521i = s50.m10521i(s50Var2, s50Var4);
        }
        if (iM10521i == 2 && m9387e() != null) {
            if (s50Var2.mo4261b() == 3) {
                return null;
            }
            return new p83(s50.m10522m(s50Var2, 0, 3, 1));
        }
        if (iM10521i == 1 && s50Var2.mo4268k(0, s50Var4, s50Var4.mo4261b())) {
            return null;
        }
        if (iM10521i != -1 || m9387e() == null) {
            if (iM10521i == -1) {
                return new p83(s50Var);
            }
            return iM10521i == 0 ? new p83(s50.m10522m(s50Var2, 0, 1, 1)) : new p83(s50.m10522m(s50Var2, 0, iM10521i, 1));
        }
        if (s50Var2.mo4261b() == 2) {
            return null;
        }
        return new p83(s50.m10522m(s50Var2, 0, 2, 1));
    }

    /* JADX INFO: renamed from: c */
    public final p83 m9385c(p83 p83Var) {
        s50 s50Var = p83Var.f27432a;
        int iM4822c = AbstractC0593e.m4822c(this);
        s50 s50Var2 = this.f27432a;
        p83 p83Var2 = iM4822c == -1 ? null : new p83(s50Var2.mo4269l(0, iM4822c));
        int iM4822c2 = AbstractC0593e.m4822c(p83Var);
        if (!z62.m13387o(p83Var2, iM4822c2 != -1 ? new p83(s50Var.mo4269l(0, iM4822c2)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + p83Var).toString());
        }
        ArrayList arrayListM9383a = m9383a();
        ArrayList arrayListM9383a2 = p83Var.m9383a();
        int iMin = Math.min(arrayListM9383a.size(), arrayListM9383a2.size());
        int i = 0;
        while (i < iMin && z62.m13387o(arrayListM9383a.get(i), arrayListM9383a2.get(i))) {
            i++;
        }
        if (i == iMin && s50Var2.mo4261b() == s50Var.mo4261b()) {
            return h50.m6221B(".");
        }
        if (arrayListM9383a2.subList(i, arrayListM9383a2.size()).indexOf(AbstractC0593e.f17547e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + p83Var).toString());
        }
        if (z62.m13387o(s50Var, AbstractC0593e.f17546d)) {
            return this;
        }
        w30 w30Var = new w30();
        s50 s50VarM4821b = AbstractC0593e.m4821b(p83Var);
        if (s50VarM4821b == null && (s50VarM4821b = AbstractC0593e.m4821b(this)) == null) {
            s50VarM4821b = AbstractC0593e.m4825f(f27431b);
        }
        int size = arrayListM9383a2.size();
        for (int i2 = i; i2 < size; i2++) {
            w30Var.m12052M(AbstractC0593e.f17547e);
            w30Var.m12052M(s50VarM4821b);
        }
        int size2 = arrayListM9383a.size();
        while (i < size2) {
            w30Var.m12052M((s50) arrayListM9383a.get(i));
            w30Var.m12052M(s50VarM4821b);
            i++;
        }
        return AbstractC0593e.m4823d(w30Var, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f27432a.compareTo(((p83) obj).f27432a);
    }

    /* JADX INFO: renamed from: d */
    public final p83 m9386d(String str) {
        w30 w30Var = new w30();
        w30Var.m12058S(str);
        return AbstractC0593e.m4820a(this, AbstractC0593e.m4823d(w30Var, false), false);
    }

    /* JADX INFO: renamed from: e */
    public final Character m9387e() {
        s50 s50Var = AbstractC0593e.f17543a;
        s50 s50Var2 = this.f27432a;
        if (s50.m10520e(s50Var2, s50Var) != -1 || s50Var2.mo4261b() < 2 || s50Var2.mo4265g(1) != 58) {
            return null;
        }
        char cMo4265g = (char) s50Var2.mo4265g(0);
        if (('a' > cMo4265g || cMo4265g >= '{') && ('A' > cMo4265g || cMo4265g >= '[')) {
            return null;
        }
        return Character.valueOf(cMo4265g);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof p83) && z62.m13387o(((p83) obj).f27432a, this.f27432a);
    }

    public final int hashCode() {
        return this.f27432a.hashCode();
    }

    public final File toFile() {
        return new File(this.f27432a.m10524o());
    }

    public final String toString() {
        return this.f27432a.m10524o();
    }
}
