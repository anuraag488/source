package p000;

import android.content.Intent;
import android.net.Uri;

/* JADX INFO: renamed from: l */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0854l implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f23654a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ C0950nl f23655b;

    public /* synthetic */ C0854l(byte b) {
        this.f23654a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        byte b = this.f23654a;
        C0950nl c0950nl = this.f23655b;
        switch (b) {
            case 0:
                return qq2.m10020d("https://play.google.com/store/apps/details?id=" + c0950nl.f25922c);
            case 1:
                Intent intent = new Intent("android.intent.action.SENDTO");
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra("android.intent.extra.EMAIL", new String[]{"ivianuu@gmail.com"});
                intent.putExtra("android.intent.extra.SUBJECT", c75.m3879k("Feedback for ", c0950nl.f25921b, " ", c0950nl.f25923d));
                return intent;
            case 2:
                Intent intent2 = new Intent("android.settings.ACCESSIBILITY_SETTINGS");
                String str = c0950nl.f25922c + "/essentials.accessibility.EsAccessibilityService";
                intent2.putExtra(":settings:fragment_args_key", str);
                intent2.putExtra(":settings:show_fragment_args", kx5.m7742x(new l73(":settings:fragment_args_key", str)));
                return intent2;
            case 3:
                Intent intent3 = new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
                String str2 = c0950nl.f25922c + "/essentials.notificationlistener.EsNotificationListenerService";
                intent3.putExtra(":settings:fragment_args_key", str2);
                intent3.putExtra(":settings:show_fragment_args", kx5.m7742x(new l73(":settings:fragment_args_key", str2)));
                return intent3;
            case 4:
                return new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + c0950nl.f25922c));
            default:
                return new Intent("android.settings.action.MANAGE_WRITE_SETTINGS", Uri.parse("package:" + c0950nl.f25922c));
        }
    }
}
