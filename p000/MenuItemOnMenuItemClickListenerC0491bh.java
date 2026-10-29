package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.view.MenuItem;
import android.view.textclassifier.TextClassification;

/* JADX INFO: renamed from: bh */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class MenuItemOnMenuItemClickListenerC0491bh implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f15261a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f15262b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f15263c;

    public /* synthetic */ MenuItemOnMenuItemClickListenerC0491bh(byte b) {
        this.f15261a = b;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
        switch (this.f15261a) {
            case 0:
                ((kj4) this.f15262b).f23182d.invoke(((C0527ch) this.f15263c).f16009a);
                break;
            default:
                Context context = (Context) this.f15262b;
                TextClassification textClassification = (TextClassification) this.f15263c;
                String text = textClassification.getText();
                qq2.m10012G(PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592));
                break;
        }
        return true;
    }
}
