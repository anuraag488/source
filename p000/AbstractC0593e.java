package p000;

import java.io.EOFException;
import java.util.ArrayList;

/* JADX INFO: renamed from: e */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0593e {

    /* JADX INFO: renamed from: a */
    public static final s50 f17543a;

    /* JADX INFO: renamed from: b */
    public static final s50 f17544b;

    /* JADX INFO: renamed from: c */
    public static final s50 f17545c;

    /* JADX INFO: renamed from: d */
    public static final s50 f17546d;

    /* JADX INFO: renamed from: e */
    public static final s50 f17547e;

    static {
        s50 s50Var = new s50("/".getBytes(z80.f35863a));
        s50Var.f29914c = "/";
        f17543a = s50Var;
        s50 s50Var2 = new s50("\\".getBytes(z80.f35863a));
        s50Var2.f29914c = "\\";
        f17544b = s50Var2;
        s50 s50Var3 = new s50("/\\".getBytes(z80.f35863a));
        s50Var3.f29914c = "/\\";
        f17545c = s50Var3;
        s50 s50Var4 = new s50(".".getBytes(z80.f35863a));
        s50Var4.f29914c = ".";
        f17546d = s50Var4;
        s50 s50Var5 = new s50("..".getBytes(z80.f35863a));
        s50Var5.f29914c = "..";
        f17547e = s50Var5;
    }

    /* JADX INFO: renamed from: a */
    public static final p83 m4820a(p83 p83Var, p83 p83Var2, boolean z) {
        if (m4822c(p83Var2) != -1 || p83Var2.m9387e() != null) {
            return p83Var2;
        }
        s50 s50VarM4821b = m4821b(p83Var);
        if (s50VarM4821b == null && (s50VarM4821b = m4821b(p83Var2)) == null) {
            s50VarM4821b = m4825f(p83.f27431b);
        }
        w30 w30Var = new w30();
        w30Var.m12052M(p83Var.f27432a);
        if (w30Var.f33056b > 0) {
            w30Var.m12052M(s50VarM4821b);
        }
        w30Var.m12052M(p83Var2.f27432a);
        return m4823d(w30Var, z);
    }

    /* JADX INFO: renamed from: b */
    public static final s50 m4821b(p83 p83Var) {
        s50 s50Var = p83Var.f27432a;
        s50 s50Var2 = f17543a;
        if (s50.m10520e(s50Var, s50Var2) != -1) {
            return s50Var2;
        }
        s50 s50Var3 = p83Var.f27432a;
        s50 s50Var4 = f17544b;
        if (s50.m10520e(s50Var3, s50Var4) != -1) {
            return s50Var4;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final int m4822c(p83 p83Var) {
        s50 s50Var = p83Var.f27432a;
        if (s50Var.mo4261b() != 0) {
            if (s50Var.mo4265g(0) != 47) {
                if (s50Var.mo4265g(0) == 92) {
                    if (s50Var.mo4261b() > 2 && s50Var.mo4265g(1) == 92) {
                        int iMo4263d = s50Var.mo4263d(2, f17544b.mo4264f());
                        return iMo4263d == -1 ? s50Var.mo4261b() : iMo4263d;
                    }
                } else if (s50Var.mo4261b() > 2 && s50Var.mo4265g(1) == 58 && s50Var.mo4265g(2) == 92) {
                    char cMo4265g = (char) s50Var.mo4265g(0);
                    if ('a' <= cMo4265g && cMo4265g < '{') {
                        return 3;
                    }
                    if ('A' <= cMo4265g && cMo4265g < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:0x009f  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:83:0x0111 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0113  */
    /* JADX WARN: Code duplicated, block: B:88:0x0128  */
    /* JADX WARN: Code duplicated, block: B:98:0x010a A[EDGE_INSN: B:98:0x010a->B:81:0x010a BREAK  A[LOOP:1: B:53:0x00a5->B:112:0x00a5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x00f8 A[SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final p83 m4823d(w30 w30Var, boolean z) throws EOFException {
        s50 s50Var;
        long j;
        char cM12063g;
        boolean z2;
        ArrayList arrayList;
        boolean zM12062e;
        s50 s50Var2;
        int size;
        int i;
        long jM12065k;
        s50 s50VarM12069u;
        s50 s50Var3;
        w30 w30Var2 = new w30();
        s50 s50VarM4824e = null;
        int i2 = 0;
        while (true) {
            if (!w30Var.m12066l(f17543a)) {
                s50Var = f17544b;
                if (!w30Var.m12066l(s50Var)) {
                    break;
                }
            }
            byte bM12067q = w30Var.m12067q();
            if (s50VarM4824e == null) {
                s50VarM4824e = m4824e(bM12067q);
            }
            i2++;
        }
        boolean z3 = i2 >= 2 && z62.m13387o(s50VarM4824e, s50Var);
        s50 s50Var4 = f17545c;
        if (z3) {
            w30Var2.m12052M(s50VarM4824e);
            w30Var2.m12052M(s50VarM4824e);
        } else {
            if (i2 <= 0) {
                long jM12065k2 = w30Var.m12065k(s50Var4);
                if (s50VarM4824e == null) {
                    s50VarM4824e = jM12065k2 == -1 ? m4825f(p83.f27431b) : m4824e(w30Var.m12063g(jM12065k2));
                }
                if (z62.m13387o(s50VarM4824e, s50Var) && w30Var.f33056b >= 2) {
                    j = -1;
                    if (w30Var.m12063g(1L) == 58 && (('a' <= (cM12063g = (char) w30Var.m12063g(0L)) && cM12063g < '{') || ('A' <= cM12063g && cM12063g < '['))) {
                        if (jM12065k2 == 2) {
                            w30Var2.mo3368d(w30Var, 3L);
                        } else {
                            w30Var2.mo3368d(w30Var, 2L);
                        }
                    }
                }
                if (w30Var2.f33056b > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                arrayList = new ArrayList();
                while (true) {
                    zM12062e = w30Var.m12062e();
                    s50Var2 = f17546d;
                    if (!zM12062e) {
                        break;
                    }
                    jM12065k = w30Var.m12065k(s50Var4);
                    if (jM12065k == j) {
                        s50VarM12069u = w30Var.m12069u(w30Var.f33056b);
                    } else {
                        s50VarM12069u = w30Var.m12069u(jM12065k);
                        w30Var.m12067q();
                    }
                    s50Var3 = f17547e;
                    if (s50VarM12069u.equals(s50Var3)) {
                        if (z2 || !arrayList.isEmpty()) {
                            if (z || (!z2 && (arrayList.isEmpty() || z62.m13387o(hb0.m6306R0(arrayList), s50Var3)))) {
                                arrayList.add(s50VarM12069u);
                            } else if (!z3 || arrayList.size() != 1) {
                                mb0.m8264E0(arrayList);
                            }
                        }
                    } else if (s50VarM12069u.equals(s50Var2) && !s50VarM12069u.equals(s50.f29911d)) {
                        arrayList.add(s50VarM12069u);
                    }
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    if (i > 0) {
                        w30Var2.m12052M(s50VarM4824e);
                    }
                    w30Var2.m12052M((s50) arrayList.get(i));
                }
                if (w30Var2.f33056b == 0) {
                    w30Var2.m12052M(s50Var2);
                }
                return new p83(w30Var2.m12069u(w30Var2.f33056b));
            }
            w30Var2.m12052M(s50VarM4824e);
        }
        j = -1;
        if (w30Var2.f33056b > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        arrayList = new ArrayList();
        while (true) {
            zM12062e = w30Var.m12062e();
            s50Var2 = f17546d;
            if (!zM12062e) {
                break;
                break;
            }
            jM12065k = w30Var.m12065k(s50Var4);
            if (jM12065k == j) {
                s50VarM12069u = w30Var.m12069u(w30Var.f33056b);
            } else {
                s50VarM12069u = w30Var.m12069u(jM12065k);
                w30Var.m12067q();
            }
            s50Var3 = f17547e;
            if (s50VarM12069u.equals(s50Var3)) {
                if (z2) {
                }
                if (z) {
                }
                arrayList.add(s50VarM12069u);
            } else if (s50VarM12069u.equals(s50Var2)) {
            }
        }
        size = arrayList.size();
        while (i < size) {
            if (i > 0) {
                w30Var2.m12052M(s50VarM4824e);
            }
            w30Var2.m12052M((s50) arrayList.get(i));
        }
        if (w30Var2.f33056b == 0) {
            w30Var2.m12052M(s50Var2);
        }
        return new p83(w30Var2.m12069u(w30Var2.f33056b));
    }

    /* JADX INFO: renamed from: e */
    public static final s50 m4824e(byte b) {
        if (b == 47) {
            return f17543a;
        }
        if (b == 92) {
            return f17544b;
        }
        C1077qn.m9987m(c75.m3877i(b, "not a directory separator: "));
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final s50 m4825f(String str) {
        if (z62.m13387o(str, "/")) {
            return f17543a;
        }
        if (z62.m13387o(str, "\\")) {
            return f17544b;
        }
        C1077qn.m9987m(zi4.m13620t("not a directory separator: ", str));
        return null;
    }
}
