package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jl1 {

    /* JADX INFO: renamed from: b */
    public static final jl1 f22391b = new jl1();

    /* JADX INFO: renamed from: c */
    public static final jl1 f22392c = new jl1();

    /* JADX INFO: renamed from: d */
    public static final jl1 f22393d = new jl1();

    /* JADX INFO: renamed from: a */
    public final uw2 f22394a = new uw2(new ll1[16]);

    /* JADX INFO: renamed from: a */
    public static void m7164a(jl1 jl1Var) {
        jl1Var.getClass();
        if (jl1Var == f22391b) {
            C1077qn.m9989o("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        if (jl1Var == f22392c) {
            C1077qn.m9989o("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        uw2 uw2Var = jl1Var.f22394a;
        int i = uw2Var.f32213c;
        if (i == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return;
        }
        Object[] objArr = uw2Var.f32211a;
        for (int i2 = 0; i2 < i; i2++) {
            px0 px0Var = (ll1) objArr[i2];
            if (!((mt2) px0Var).f25195a.f25208n) {
                q32.m9721c("visitChildren called on an unattached node");
            }
            uw2 uw2Var2 = new uw2(new mt2[16]);
            mt2 mt2Var = ((mt2) px0Var).f25195a;
            mt2 mt2Var2 = mt2Var.f25200f;
            if (mt2Var2 == null) {
                sc6.m10663e(uw2Var2, mt2Var);
            } else {
                uw2Var2.m11663b(mt2Var2);
            }
            while (true) {
                int i3 = uw2Var2.f32213c;
                if (i3 == 0) {
                    break;
                }
                mt2 mt2VarM10644P = (mt2) uw2Var2.m11672l(i3 - 1);
                if ((mt2VarM10644P.f25198d & 1024) == 0) {
                    sc6.m10663e(uw2Var2, mt2VarM10644P);
                } else {
                    while (mt2VarM10644P != null) {
                        if ((mt2VarM10644P.f25197c & 1024) != 0) {
                            uw2 uw2Var3 = null;
                            while (mt2VarM10644P != null) {
                                if (mt2VarM10644P instanceof sl1) {
                                    if (((sl1) mt2VarM10644P).m10861W0(7)) {
                                        break;
                                    }
                                } else if ((mt2VarM10644P.f25197c & 1024) != 0 && (mt2VarM10644P instanceof qx0)) {
                                    int i4 = 0;
                                    for (mt2 mt2Var3 = ((qx0) mt2VarM10644P).f28863p; mt2Var3 != null; mt2Var3 = mt2Var3.f25200f) {
                                        if ((mt2Var3.f25197c & 1024) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                mt2VarM10644P = mt2Var3;
                                            } else {
                                                if (uw2Var3 == null) {
                                                    uw2Var3 = new uw2(new mt2[16]);
                                                }
                                                if (mt2VarM10644P != null) {
                                                    uw2Var3.m11663b(mt2VarM10644P);
                                                    mt2VarM10644P = null;
                                                }
                                                uw2Var3.m11663b(mt2Var3);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                mt2VarM10644P = sc6.m10644P(uw2Var3);
                            }
                            break;
                        }
                        mt2VarM10644P = mt2VarM10644P.f25200f;
                    }
                }
            }
        }
    }
}
