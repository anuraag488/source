package p000;

import android.util.JsonReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ww5 {

    /* JADX INFO: renamed from: a */
    public String f33808a;

    /* JADX INFO: renamed from: b */
    public String f33809b;

    /* JADX INFO: renamed from: c */
    public String f33810c;

    /* JADX INFO: renamed from: d */
    public List f33811d;

    /* JADX INFO: renamed from: e */
    public List f33812e;

    /* JADX INFO: renamed from: f */
    public String f33813f;

    /* JADX INFO: renamed from: g */
    public int f33814g;

    /* JADX INFO: renamed from: h */
    public int f33815h;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public static ww5 m12432a(JsonReader jsonReader) {
        int i;
        ww5 ww5Var = new ww5();
        ww5Var.f33814g = 1;
        List list = Collections.EMPTY_LIST;
        ww5Var.f33811d = list;
        ww5Var.f33812e = list;
        ww5Var.f33815h = 1;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            int i2 = 3;
            switch (strNextName.hashCode()) {
                case -2001388947:
                    if (strNextName.equals("consent_signal")) {
                        String strNextString = jsonReader.nextString();
                        switch (strNextString.hashCode()) {
                            case -2058725357:
                                if (!strNextString.equals("CONSENT_SIGNAL_COLLECT_CONSENT")) {
                                    wb1.m12191j("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                    return null;
                                }
                                i2 = 5;
                                ww5Var.f33814g = i2;
                                break;
                                break;
                            case -1969035850:
                                if (!strNextString.equals("CONSENT_SIGNAL_ERROR")) {
                                    wb1.m12191j("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                    return null;
                                }
                                i2 = 7;
                                ww5Var.f33814g = i2;
                                break;
                                break;
                            case -1263695752:
                                if (!strNextString.equals("CONSENT_SIGNAL_UNKNOWN")) {
                                    wb1.m12191j("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                    return null;
                                }
                                i2 = 1;
                                ww5Var.f33814g = i2;
                                break;
                                break;
                            case -954325659:
                                if (!strNextString.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                                    wb1.m12191j("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                    return null;
                                }
                                ww5Var.f33814g = i2;
                                break;
                            case -918677260:
                                if (!strNextString.equals("CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION")) {
                                    wb1.m12191j("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                    return null;
                                }
                                i2 = 8;
                                ww5Var.f33814g = i2;
                                break;
                                break;
                            case 429411856:
                                if (!strNextString.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                                    wb1.m12191j("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                    return null;
                                }
                                i2 = 4;
                                ww5Var.f33814g = i2;
                                break;
                                break;
                            case 467888915:
                                if (!strNextString.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                                    wb1.m12191j("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                    return null;
                                }
                                i2 = 2;
                                ww5Var.f33814g = i2;
                                break;
                                break;
                            case 1725474845:
                                if (!strNextString.equals("CONSENT_SIGNAL_NOT_REQUIRED")) {
                                    wb1.m12191j("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                    return null;
                                }
                                i2 = 6;
                                ww5Var.f33814g = i2;
                                break;
                                break;
                            default:
                                wb1.m12191j("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                return null;
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -1938755376:
                    if (strNextName.equals("error_message")) {
                        ww5Var.f33810c = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -1851537225:
                    if (strNextName.equals("consent_form_base_url")) {
                        ww5Var.f33809b = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -1734348803:
                    if (strNextName.equals("client_side_pingback_url")) {
                        ww5Var.f33813f = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -1324537865:
                    if (strNextName.equals("privacy_options_required")) {
                        String strNextString2 = jsonReader.nextString();
                        int iHashCode = strNextString2.hashCode();
                        if (iHashCode == -1888946261) {
                            if (!strNextString2.equals("NOT_REQUIRED")) {
                                wb1.m12191j("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(strNextString2));
                                return null;
                            }
                            ww5Var.f33815h = i2;
                        } else if (iHashCode != 389487519) {
                            if (iHashCode != 433141802 || !strNextString2.equals("UNKNOWN")) {
                                wb1.m12191j("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(strNextString2));
                                return null;
                            }
                            i2 = 1;
                            ww5Var.f33815h = i2;
                        } else {
                            if (!strNextString2.equals("REQUIRED")) {
                                wb1.m12191j("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(strNextString2));
                                return null;
                            }
                            i2 = 2;
                            ww5Var.f33815h = i2;
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -1161803523:
                    if (strNextName.equals("actions")) {
                        ww5Var.f33812e = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            vw5 vw5Var = new vw5();
                            vw5Var.f32900b = 1;
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                String strNextName2 = jsonReader.nextName();
                                int iHashCode2 = strNextName2.hashCode();
                                if (iHashCode2 != -2105551094) {
                                    if (iHashCode2 == 1583758243 && strNextName2.equals("action_type")) {
                                        String strNextString3 = jsonReader.nextString();
                                        int iHashCode3 = strNextString3.hashCode();
                                        if (iHashCode3 != 64208429) {
                                            if (iHashCode3 != 82862015) {
                                                if (iHashCode3 != 1856333582 || !strNextString3.equals("UNKNOWN_ACTION_TYPE")) {
                                                    wb1.m12191j("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(strNextString3));
                                                    return null;
                                                }
                                                i = 1;
                                                vw5Var.f32900b = i;
                                            } else {
                                                if (!strNextString3.equals("WRITE")) {
                                                    wb1.m12191j("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(strNextString3));
                                                    return null;
                                                }
                                                i = 2;
                                                vw5Var.f32900b = i;
                                            }
                                        } else {
                                            if (!strNextString3.equals("CLEAR")) {
                                                wb1.m12191j("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(strNextString3));
                                                return null;
                                            }
                                            i = 3;
                                            vw5Var.f32900b = i;
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                } else if (strNextName2.equals("args_json")) {
                                    vw5Var.f32899a = jsonReader.nextString();
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            ww5Var.f33812e.add(vw5Var);
                        }
                        jsonReader.endArray();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -986806987:
                    if (strNextName.equals("request_info_keys")) {
                        ww5Var.f33811d = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            ww5Var.f33811d.add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -790907624:
                    if (strNextName.equals("consent_form_payload")) {
                        ww5Var.f33808a = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return ww5Var;
    }
}
