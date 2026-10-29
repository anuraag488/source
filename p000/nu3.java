package p000;

import android.content.Intent;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nu3 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f26096a;

    public /* synthetic */ nu3(byte b) {
        this.f26096a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        byte b = this.f26096a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return null;
            case 1:
                return new HashSet();
            case 2:
                ic2[] ic2VarArr = qw3.f28850a;
                return r71.f29063a;
            case 3:
                return new wx3(0);
            case 4:
                return new yy3(true, true, false, false);
            case 5:
                return ju4Var;
            case 6:
                return null;
            case 7:
                return new s44();
            case 8:
                return null;
            case 9:
                return ju4Var;
            case 10:
            case 11:
                return null;
            case 12:
                Intent intent = new Intent("android.media.action.STILL_IMAGE_CAMERA");
                intent.setPackage("com.snapchat.android");
                intent.addFlags(32768);
                return intent;
            case 13:
                return p11.m9350a(0.0f);
            case 14:
            case 15:
                return null;
            case 16:
                return ls4.f24334a;
            case 17:
                return ex0.f18553a;
            case 18:
                return Boolean.TRUE;
            case 19:
                return new js4();
            default:
                return ju4Var;
        }
    }
}
