package p000;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.view.MenuItem;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zl4 implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ RemoteAction f36170a;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
        qq2.m10012G(this.f36170a.getActionIntent());
        return true;
    }
}
