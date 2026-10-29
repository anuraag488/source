package p000;

import android.os.Bundle;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vt5 {

    /* JADX INFO: renamed from: a */
    public byte f32869a;

    /* JADX INFO: renamed from: b */
    public wx1 f32870b;

    /* JADX INFO: renamed from: c */
    public lo5 f32871c;

    /* JADX INFO: renamed from: d */
    public String f32872d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final boolean m11988a(int i) {
        wx1 wx1Var = this.f32870b;
        String str = this.f32872d;
        byte b = this.f32869a;
        if (b == i) {
            Log.w("HsdpOverlay", "targetPackage: " + str + " status was already set to " + i);
            return false;
        }
        if (b == 4) {
            Log.w("HsdpOverlay", "targetPackage: " + str + " status was destroyed so cannot be updated");
            return false;
        }
        if (Log.isLoggable("HsdpOverlay", 4)) {
            Log.i("HsdpOverlay", "targetPackage: " + str + " status: " + ((int) this.f32869a) + "->" + i);
        }
        if (i == 2) {
            Bundle bundle = new Bundle();
            bundle.putString("targetPackage", str);
            wx1Var.onShown(bundle);
        } else if (i == 3) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("targetPackage", str);
            wx1Var.onDismissed(bundle2);
        } else if (i != 4) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("targetPackage", str);
            bundle3.putBoolean("dldpRedirect", true);
            wx1Var.onDismissed(bundle3);
        } else {
            byte b2 = this.f32869a;
            if (b2 == 2) {
                Bundle bundle4 = new Bundle();
                bundle4.putString("targetPackage", str);
                bundle4.putString("errorMessage", "HSDP overlay destroyed");
                wx1Var.onDismissed(bundle4);
            } else if (b2 == 1) {
                Bundle bundle5 = new Bundle();
                bundle5.putString("targetPackage", str);
                bundle5.putString("errorMessage", "HSDP overlay destroyed before shown");
                wx1Var.onError(bundle5);
            }
        }
        this.f32869a = i;
        return true;
    }

    public final String toString() {
        byte b = this.f32869a;
        return "HsdpOverlay{'" + this.f32872d + "': " + ((int) b) + ", " + this.f32870b.toString() + '}';
    }
}
