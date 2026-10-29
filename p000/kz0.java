package p000;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class kz0 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ nz0 f23630a;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        nz0 nz0Var = this.f23630a;
        Dialog dialog = nz0Var.f26216g0;
        if (dialog != null) {
            nz0Var.onCancel(dialog);
        }
    }
}
