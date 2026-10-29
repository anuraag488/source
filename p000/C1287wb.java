package p000;

import android.graphics.Rect;
import android.view.autofill.AutofillId;

/* JADX INFO: renamed from: wb */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1287wb extends AbstractC0702gv implements yk1 {

    /* JADX INFO: renamed from: a */
    public z32 f33199a;

    /* JADX INFO: renamed from: b */
    public l14 f33200b;

    /* JADX INFO: renamed from: c */
    public ViewTreeObserverOnGlobalLayoutListenerC1140sc f33201c;

    /* JADX INFO: renamed from: d */
    public ll3 f33202d;

    /* JADX INFO: renamed from: e */
    public String f33203e;

    /* JADX INFO: renamed from: f */
    public Rect f33204f;

    /* JADX INFO: renamed from: g */
    public AutofillId f33205g;

    /* JADX INFO: renamed from: h */
    public mv2 f33206h;

    /* JADX INFO: renamed from: i */
    public boolean f33207i;

    @Override // p000.yk1
    /* JADX INFO: renamed from: a */
    public final void mo10609a(sl1 sl1Var, sl1 sl1Var2) {
        wf2 wf2VarM10652X;
        e14 e14VarM12297x;
        wf2 wf2VarM10652X2;
        e14 e14VarM12297x2;
        ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = this.f33201c;
        z32 z32Var = this.f33199a;
        if (sl1Var != null && (wf2VarM10652X2 = sc6.m10652X(sl1Var)) != null && (e14VarM12297x2 = wf2VarM10652X2.m12297x()) != null && zy5.m13850N(e14VarM12297x2)) {
            z32Var.m13308F().notifyViewExited(viewTreeObserverOnGlobalLayoutListenerC1140sc, wf2VarM10652X2.f33312b);
        }
        if (sl1Var2 == null || (wf2VarM10652X = sc6.m10652X(sl1Var2)) == null || (e14VarM12297x = wf2VarM10652X.m12297x()) == null || !zy5.m13850N(e14VarM12297x)) {
            return;
        }
        int i = wf2VarM10652X.f33312b;
        ll3 ll3Var = this.f33202d;
        wf2 wf2Var = (wf2) ll3Var.f24126a.m8197b(i);
        if (wf2Var == null || wf2Var.f33317g == -4) {
            return;
        }
        C0795je c0795je = ll3Var.f24128c;
        int iM8029d = ll3Var.m8029d(wf2Var);
        long[] jArr = (long[]) c0795je.f22194c;
        long j = jArr[iM8029d];
        long j2 = jArr[iM8029d + 1];
        z32Var.m13308F().notifyViewEntered(viewTreeObserverOnGlobalLayoutListenerC1140sc, i, new Rect((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2));
    }
}
