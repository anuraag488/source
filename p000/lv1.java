package p000;

import android.os.Vibrator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lv1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Vibrator f24388a;

    /* JADX INFO: renamed from: a */
    public final void m8115a(dv1 dv1Var) {
        Object objM10807c;
        Vibrator vibrator = this.f24388a;
        if (vibrator != null) {
            try {
                vibrator.vibrate(nv1.m8858c(dv1Var));
                objM10807c = ju4.f22634a;
            } catch (Throwable th) {
                sc6.m10643O(th);
                objM10807c = sj3.m10807c(th);
            }
        } else {
            objM10807c = null;
        }
        qq2.m10007B(objM10807c);
    }
}
