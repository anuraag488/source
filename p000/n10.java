package p000;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n10 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f25375a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ wp1 f25376b;

    public /* synthetic */ n10(byte b) {
        this.f25375a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        byte b = this.f25375a;
        wp1 wp1Var = this.f25376b;
        switch (b) {
            case 0:
                wp1Var.invoke();
                return Boolean.TRUE;
            case 1:
                Boolean bool = (Boolean) wp1Var.invoke();
                bool.booleanValue();
                return bool;
            case 2:
                return wp1Var.invoke();
            case 3:
                wp1Var.invoke();
                return ju4.f22634a;
            default:
                File file = (File) wp1Var.invoke();
                if (hd4.m6355u0('.', file.getName(), "").equals("preferences_pb")) {
                    return file.getAbsoluteFile();
                }
                nm0.m8796h("File extension for file: ", file, " does not match required extension for Preferences file: preferences_pb");
                return null;
        }
    }
}
