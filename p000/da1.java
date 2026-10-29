package p000;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class da1 extends DialogFragment {

    /* JADX INFO: renamed from: a */
    public Dialog f16880a;

    /* JADX INFO: renamed from: b */
    public DialogInterface.OnCancelListener f16881b;

    /* JADX INFO: renamed from: c */
    public AlertDialog f16882c;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f16881b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f16880a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        AlertDialog alertDialog = this.f16882c;
        if (alertDialog != null) {
            return alertDialog;
        }
        Activity activity = getActivity();
        y42.m12854a0(activity);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).create();
        this.f16882c = alertDialogCreate;
        return alertDialogCreate;
    }
}
