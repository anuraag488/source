package p000;

import java.io.File;
import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: js */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0809js {

    /* JADX INFO: renamed from: a */
    public C0773is f22549a;

    /* JADX INFO: renamed from: b */
    public String f22550b;

    /* JADX INFO: renamed from: c */
    public File f22551c;

    /* JADX INFO: renamed from: a */
    public static C0809js m7267a(C0773is c0773is, String str, File file) {
        C0809js c0809js = new C0809js();
        c0809js.f22549a = c0773is;
        if (str == null) {
            xy4.m12782k("Null sessionId");
            return null;
        }
        c0809js.f22550b = str;
        if (file == null) {
            xy4.m12782k("Null reportFile");
            return null;
        }
        c0809js.f22551c = file;
        VarHandle.storeStoreFence();
        return c0809js;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0809js)) {
            return false;
        }
        C0809js c0809js = (C0809js) obj;
        return this.f22549a.equals(c0809js.f22549a) && this.f22550b.equals(c0809js.f22550b) && this.f22551c.equals(c0809js.f22551c);
    }

    public final int hashCode() {
        return this.f22551c.hashCode() ^ ((((this.f22549a.hashCode() ^ 1000003) * 1000003) ^ this.f22550b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f22549a + ", sessionId=" + this.f22550b + ", reportFile=" + this.f22551c + "}";
    }
}
