package p000;

import ads_mobile_sdk.C0313rh;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: gm */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0693gm implements oe1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Context f19871a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ C0532cm f19872b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ C0950nl f19873c;

    @Override // p000.oe1
    /* JADX INFO: renamed from: a */
    public final Object mo3767a(wm0 wm0Var) throws PackageManager.NameNotFoundException {
        Bitmap bitmapM5540k;
        Bitmap bitmapM5540k2;
        Drawable monochrome;
        Context context = this.f19871a;
        PackageManager packageManager = context.getPackageManager();
        C0532cm c0532cm = this.f19872b;
        String str = c0532cm.f16117a;
        Drawable applicationIcon = packageManager.getApplicationIcon(str);
        if (this.f19873c.f25925f >= 33 && c0532cm.f16118b) {
            AdaptiveIconDrawable adaptiveIconDrawable = (AdaptiveIconDrawable) (!(applicationIcon instanceof AdaptiveIconDrawable) ? null : applicationIcon);
            if (adaptiveIconDrawable == null || (monochrome = adaptiveIconDrawable.getMonochrome()) == null || (bitmapM5540k2 = C0638f5.m5540k(monochrome, 0.8333333f)) == null) {
                if (adaptiveIconDrawable != null) {
                    Drawable foreground = adaptiveIconDrawable.getForeground();
                    if (foreground == null) {
                        foreground = adaptiveIconDrawable;
                    }
                    bitmapM5540k = C0638f5.m5540k(C0638f5.m5549t(context, foreground, str), adaptiveIconDrawable.getForeground() == null ? 1.0f : 0.8333333f);
                } else {
                    bitmapM5540k = null;
                }
                bitmapM5540k2 = bitmapM5540k == null ? C0638f5.m5540k(C0638f5.m5549t(context, new BitmapDrawable(context.getResources(), C0638f5.m5527G(applicationIcon, C0313rh.f10793i1, 0)), str), 1.0f) : bitmapM5540k;
            }
            applicationIcon = bitmapM5540k2 != null ? new BitmapDrawable(context.getResources(), bitmapM5540k2) : null;
            if (applicationIcon == null) {
                nm0.m8798k(str, "No monochrome for icon ");
                return null;
            }
        }
        return new d41(applicationIcon, false, kt0.f23415c);
    }
}
