package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import essentials.app.EsActivity;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class ue4 extends nz0 {

    /* JADX INFO: renamed from: l0 */
    public Dialog f31812l0;

    /* JADX INFO: renamed from: m0 */
    public DialogInterface.OnCancelListener f31813m0;

    /* JADX INFO: renamed from: n0 */
    public AlertDialog f31814n0;

    @Override // p000.nz0, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f31813m0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // p000.nz0
    /* JADX INFO: renamed from: x */
    public final Dialog mo8911x() {
        Dialog dialog = this.f31812l0;
        if (dialog != null) {
            return dialog;
        }
        this.f26212c0 = false;
        AlertDialog alertDialog = this.f31814n0;
        if (alertDialog != null) {
            return alertDialog;
        }
        rn1 rn1Var = this.f27798u;
        EsActivity esActivity = rn1Var == null ? null : rn1Var.f29431v;
        y42.m12854a0(esActivity);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(esActivity).create();
        this.f31814n0 = alertDialogCreate;
        return alertDialogCreate;
    }
}
