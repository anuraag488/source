package essentials.notificationlistener;

import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import essentials.app.EsApp;
import java.lang.invoke.VarHandle;
import p000.C1017p0;
import p000.a83;
import p000.b23;
import p000.hj0;
import p000.k43;
import p000.nc4;
import p000.pg0;
import p000.ui0;
import p000.zi0;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class EsNotificationListenerService extends NotificationListenerService {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f18453c = 0;

    /* JADX INFO: renamed from: a */
    public zi0 f18454a;

    /* JADX INFO: renamed from: b */
    public b23 f18455b;

    @Override // android.service.notification.NotificationListenerService
    public final void onListenerConnected() {
        nc4 nc4Var = hj0.f20619a;
        ui0 ui0Var = (ui0) ((EsApp) getApplicationContext()).f18452b.getValue();
        C1017p0 c1017p0 = new C1017p0((byte) 17);
        c1017p0.f27254b = this;
        VarHandle.storeStoreFence();
        this.f18454a = k43.m7373G(ui0Var, new pg0(-31038364, true, c1017p0));
    }

    @Override // android.service.notification.NotificationListenerService
    public final void onListenerDisconnected() {
        zi0 zi0Var = this.f18454a;
        if (zi0Var != null) {
            zi0Var.mo8488a();
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public final void onNotificationPosted(StatusBarNotification statusBarNotification) {
        b23 b23Var = this.f18455b;
        if (b23Var != null) {
            a83 a83Var = b23Var.f15038a;
            a83Var.m133i(a83Var.m132h() + 1);
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public final void onNotificationRankingUpdate(NotificationListenerService.RankingMap rankingMap) {
        b23 b23Var = this.f18455b;
        if (b23Var != null) {
            a83 a83Var = b23Var.f15038a;
            a83Var.m133i(a83Var.m132h() + 1);
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public final void onNotificationRemoved(StatusBarNotification statusBarNotification) {
        b23 b23Var = this.f18455b;
        if (b23Var != null) {
            a83 a83Var = b23Var.f15038a;
            a83Var.m133i(a83Var.m132h() + 1);
        }
    }
}
