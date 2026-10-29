package p000;

import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h90 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f20444a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ q14 f20445b;

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f20444a;
        boolean z = true;
        q14 q14Var = this.f20445b;
        switch (b) {
            case 0:
                h83 h83Var = (h83) ((pp4) obj);
                h83Var.f20425p = true;
                h83Var.f20424o.invoke(q14Var);
                y70.m13004E(h83Var);
                return Boolean.FALSE;
            default:
                AutofillValue autofillValue = ((C1401zd) obj).f35993a;
                Boolean boolValueOf = autofillValue.isToggle() ? Boolean.valueOf(autofillValue.getToggleValue()) : null;
                if (boolValueOf != null) {
                    ln4 ln4Var = boolValueOf.booleanValue() ? ln4.f24214a : ln4.f24215b;
                    ic2[] ic2VarArr = o14.f26289a;
                    p14 p14Var = m14.f24544K;
                    ic2 ic2Var = o14.f26289a[26];
                    p14Var.getClass();
                    q14Var.mo4898a(p14Var, ln4Var);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
