package p000;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class c11 implements ti1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f15752a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ti1 f15753b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ ql3 f15754c;

    public /* synthetic */ c11(byte b) {
        this.f15752a = b;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0077  */
    /* JADX WARN: Code duplicated, block: B:38:0x008a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v11 */
    @Override // p000.ti1
    public final Object emit(Object obj, wm0 wm0Var) {
        b11 b11Var;
        dj1 dj1Var;
        hp1 hp1Var;
        Object objPrevious;
        kr3 kr3Var;
        byte b = this.f15752a;
        Object obj2 = ju4.f22634a;
        kr3 kr3Var2 = null;
        switch (b) {
            case 0:
                ql3 ql3Var = this.f15754c;
                if (wm0Var instanceof b11) {
                    b11Var = (b11) wm0Var;
                    int i = b11Var.f14995v;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        b11Var.f14995v = i - Integer.MIN_VALUE;
                    } else {
                        b11Var = new b11(this, wm0Var);
                    }
                } else {
                    b11Var = new b11(this, wm0Var);
                }
                Object obj3 = b11Var.f14993t;
                ap0 ap0Var = ap0.f14763a;
                int i2 = b11Var.f14995v;
                if (i2 != 0) {
                    if (i2 == 1) {
                        k43.m7376J(obj3);
                        return obj2;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj3);
                Object obj4 = ql3Var.f28555a;
                if (obj4 != e23.f17640a && z62.m13387o(obj4, obj)) {
                    return obj2;
                }
                ql3Var.f28555a = obj;
                ti1 ti1Var = this.f15753b;
                b11Var.f14995v = 1;
                return ti1Var.emit(obj, b11Var) == ap0Var ? ap0Var : obj2;
            case 1:
                if (wm0Var instanceof dj1) {
                    dj1Var = (dj1) wm0Var;
                    int i3 = dj1Var.f17100v;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        dj1Var.f17100v = i3 - Integer.MIN_VALUE;
                    } else {
                        dj1Var = new dj1(this, wm0Var);
                    }
                } else {
                    dj1Var = new dj1(this, wm0Var);
                }
                Object obj5 = dj1Var.f17098t;
                ap0 ap0Var2 = ap0.f14763a;
                int i4 = dj1Var.f17100v;
                try {
                    if (i4 == 0) {
                        k43.m7376J(obj5);
                        ti1 ti1Var2 = this.f15753b;
                        dj1Var.f17100v = 1;
                        Object objEmit = ti1Var2.emit(obj, dj1Var);
                        this = objEmit;
                        if (objEmit == ap0Var2) {
                            obj2 = ap0Var2;
                            this = objEmit;
                        }
                    } else {
                        if (i4 != 1) {
                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        k43.m7376J(obj5);
                        this = this;
                    }
                    return obj2;
                } catch (Throwable th) {
                    this.f15754c.f28555a = th;
                    throw th;
                }
            default:
                ql3 ql3Var2 = this.f15754c;
                if (wm0Var instanceof hp1) {
                    hp1Var = (hp1) wm0Var;
                    int i5 = hp1Var.f20765u;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        hp1Var.f20765u = i5 - Integer.MIN_VALUE;
                    } else {
                        hp1Var = new hp1(this, wm0Var);
                    }
                } else {
                    hp1Var = new hp1(this, wm0Var);
                }
                Object obj6 = hp1Var.f20764t;
                ap0 ap0Var3 = ap0.f14763a;
                int i6 = hp1Var.f20765u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        k43.m7376J(obj6);
                        return obj2;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj6);
                ti1 ti1Var3 = this.f15753b;
                List list = (List) obj;
                ListIterator listIterator = list.listIterator(list.size());
                do {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                    } else {
                        objPrevious = null;
                    }
                    kr3Var = (kr3) objPrevious;
                    if (kr3Var != null && list.size() > 1) {
                        kr3Var2 = kr3Var;
                    }
                    ql3Var2.f28555a = list;
                    if (kr3Var2 != null) {
                        return obj2;
                    }
                    hp1Var.f20765u = 1;
                    if (ti1Var3.emit(kr3Var2, hp1Var) == ap0Var3) {
                        return ap0Var3;
                    }
                    return obj2;
                } while (((List) ql3Var2.f28555a).contains((kr3) objPrevious));
                kr3Var = (kr3) objPrevious;
                if (kr3Var != null) {
                    kr3Var2 = kr3Var;
                }
                ql3Var2.f28555a = list;
                if (kr3Var2 != null) {
                    return obj2;
                }
                hp1Var.f20765u = 1;
                if (ti1Var3.emit(kr3Var2, hp1Var) == ap0Var3) {
                    return ap0Var3;
                }
                return obj2;
        }
    }
}
