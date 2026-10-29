package p000;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tb2 {

    /* JADX INFO: renamed from: a */
    public AbstractC0856l1 f31050a;

    /* JADX INFO: renamed from: b */
    public short f31051b;

    /* JADX INFO: renamed from: c */
    public int f31052c;

    /* JADX INFO: renamed from: a */
    public final aa2 m11019a() {
        short s = this.f31051b;
        AbstractC0856l1 abstractC0856l1 = this.f31050a;
        byte bM7808v = abstractC0856l1.m7808v();
        if (bM7808v == 1) {
            return m11022d(true);
        }
        if (bM7808v == 0) {
            return m11022d(false);
        }
        if (bM7808v != 6) {
            if (bM7808v != 8) {
                AbstractC0856l1.m7793r(abstractC0856l1, "Cannot read Json element because of unexpected ".concat(z62.m13375d0(bM7808v)), 0, 6);
                throw null;
            }
            int i = this.f31052c + 1;
            this.f31052c = i;
            if (i >= s) {
                zc6.m13506C(s);
                throw null;
            }
            n92 n92VarM11020b = m11020b();
            this.f31052c--;
            return n92VarM11020b;
        }
        int i2 = this.f31052c;
        int i3 = i2 + 1;
        this.f31052c = i3;
        if (i3 >= s) {
            zc6.m13506C(s);
            throw null;
        }
        if (i3 != 200) {
            byte bM7800i = abstractC0856l1.m7800i((byte) 6);
            if (abstractC0856l1.m7808v() == 4) {
                AbstractC0856l1.m7793r(abstractC0856l1, "Unexpected leading comma", 0, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (abstractC0856l1.mo4480d()) {
                String strM7802l = abstractC0856l1.m7802l();
                abstractC0856l1.m7800i((byte) 5);
                linkedHashMap.put(strM7802l, m11019a());
                bM7800i = abstractC0856l1.mo4482h();
                if (bM7800i != 4) {
                    if (bM7800i == 7) {
                        break;
                    }
                    AbstractC0856l1.m7793r(abstractC0856l1, "Expected end of the object or comma", 0, 6);
                    throw null;
                }
            }
            if (bM7800i == 6) {
                abstractC0856l1.m7800i((byte) 7);
            } else if (bM7800i == 4) {
                kx5.m7691V(abstractC0856l1);
                throw null;
            }
            va2 va2Var = new va2(linkedHashMap);
            this.f31052c--;
            return va2Var;
        }
        this.f31052c = i2;
        rb2 rb2Var = new rb2(this, null);
        ap0 ap0Var = mv0.f25228a;
        nv0 nv0Var = new nv0();
        nv0Var.f26107a = rb2Var;
        nv0Var.f26108b = nv0Var;
        ap0 ap0Var2 = mv0.f25228a;
        nv0Var.f26109c = ap0Var2;
        while (true) {
            Object obj = nv0Var.f26109c;
            wm0 wm0Var = nv0Var.f26108b;
            if (wm0Var == null) {
                k43.m7376J(obj);
                return (aa2) obj;
            }
            if (z62.m13387o(ap0Var2, obj)) {
                try {
                    rb2 rb2Var2 = nv0Var.f26107a;
                    as4.m3259r(3, rb2Var2);
                    rb2 rb2Var3 = new rb2(rb2Var2.f29130x, wm0Var);
                    rb2Var3.f29129w = nv0Var;
                    Object objInvokeSuspend = rb2Var3.invokeSuspend(ju4.f22634a);
                    if (objInvokeSuspend != ap0.f14763a) {
                        wm0Var.resumeWith(objInvokeSuspend);
                    }
                } catch (Throwable th) {
                    wm0Var.resumeWith(k43.m7389n(th));
                }
            } else {
                nv0Var.f26109c = ap0Var2;
                wm0Var.resumeWith(obj);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final n92 m11020b() {
        AbstractC0856l1 abstractC0856l1 = this.f31050a;
        byte bMo4482h = abstractC0856l1.mo4482h();
        if (abstractC0856l1.m7808v() == 4) {
            AbstractC0856l1.m7793r(abstractC0856l1, "Unexpected leading comma", 0, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (abstractC0856l1.mo4480d()) {
            arrayList.add(m11019a());
            bMo4482h = abstractC0856l1.mo4482h();
            if (bMo4482h != 4) {
                boolean z = bMo4482h == 9;
                int i = abstractC0856l1.f23686b;
                if (!z) {
                    AbstractC0856l1.m7793r(abstractC0856l1, "Expected end of the array or comma", i, 4);
                    throw null;
                }
            }
        }
        if (bMo4482h == 8) {
            abstractC0856l1.m7800i((byte) 9);
        } else if (bMo4482h == 4) {
            kx5.m7690U(abstractC0856l1, "array");
            throw null;
        }
        return new n92(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: c */
    public final Object m11021c(nv0 nv0Var, AbstractC0888lx abstractC0888lx) {
        sb2 sb2Var;
        byte bM7800i;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        tb2 tb2Var;
        byte bMo4482h;
        AbstractC0856l1 abstractC0856l1;
        AbstractC0856l1 abstractC0856l2 = this.f31050a;
        if (abstractC0888lx instanceof sb2) {
            sb2Var = (sb2) abstractC0888lx;
            int i = sb2Var.f30058z;
            if ((i & Integer.MIN_VALUE) != 0) {
                sb2Var.f30058z = i - Integer.MIN_VALUE;
            } else {
                sb2Var = new sb2(this, abstractC0888lx);
            }
        } else {
            sb2Var = new sb2(this, abstractC0888lx);
        }
        Object obj = sb2Var.f30056x;
        ap0 ap0Var = ap0.f14763a;
        int i2 = sb2Var.f30058z;
        if (i2 != 0) {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str = sb2Var.f30055w;
            linkedHashMap2 = sb2Var.f30054v;
            tb2Var = sb2Var.f30053u;
            nv0 nv0Var2 = sb2Var.f30052t;
            k43.m7376J(obj);
            linkedHashMap2.put(str, (aa2) obj);
            bMo4482h = tb2Var.f31050a.mo4482h();
            if (bMo4482h == 4) {
                bM7800i = bMo4482h;
                this = tb2Var;
                linkedHashMap = linkedHashMap2;
                nv0Var = nv0Var2;
            } else if (bMo4482h != 7) {
                AbstractC0856l1.m7793r(tb2Var.f31050a, "Expected end of the object or comma", 0, 6);
                throw null;
            }
            abstractC0856l1 = tb2Var.f31050a;
            if (bMo4482h == 6) {
                abstractC0856l1.m7800i((byte) 7);
            } else if (bMo4482h == 4) {
                kx5.m7691V(abstractC0856l1);
                throw null;
            }
            return new va2(linkedHashMap2);
        }
        k43.m7376J(obj);
        bM7800i = abstractC0856l2.m7800i((byte) 6);
        if (abstractC0856l2.m7808v() == 4) {
            AbstractC0856l1.m7793r(abstractC0856l2, "Unexpected leading comma", 0, 6);
            throw null;
        }
        linkedHashMap = new LinkedHashMap();
        AbstractC0856l1 abstractC0856l3 = this.f31050a;
        if (abstractC0856l3.mo4480d()) {
            String strM7802l = abstractC0856l3.m7802l();
            abstractC0856l3.m7800i((byte) 5);
            sb2Var.f30052t = nv0Var;
            sb2Var.f30053u = this;
            sb2Var.f30054v = linkedHashMap;
            sb2Var.f30055w = strM7802l;
            sb2Var.f30058z = 1;
            nv0Var.f26108b = sb2Var;
            return ap0Var;
        }
        linkedHashMap2 = linkedHashMap;
        tb2Var = this;
        bMo4482h = bM7800i;
        abstractC0856l1 = tb2Var.f31050a;
        if (bMo4482h == 6) {
            abstractC0856l1.m7800i((byte) 7);
        } else if (bMo4482h == 4) {
            kx5.m7691V(abstractC0856l1);
            throw null;
        }
        return new va2(linkedHashMap2);
    }

    /* JADX INFO: renamed from: d */
    public final fb2 m11022d(boolean z) {
        AbstractC0856l1 abstractC0856l1 = this.f31050a;
        String strM7804n = !z ? abstractC0856l1.m7804n() : abstractC0856l1.m7802l();
        return (z || !z62.m13387o(strM7804n, "null")) ? new na2(strM7804n, z, null) : ra2.INSTANCE;
    }
}
