/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/policytagmanagerserialization.proto

package com.google.cloud.datacatalog.v1;

public final class PolicyTagManagerSerializationProto {
  private PolicyTagManagerSerializationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_SerializedTaxonomy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_SerializedTaxonomy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_SerializedPolicyTag_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_SerializedPolicyTag_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_ImportTaxonomiesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_ImportTaxonomiesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_InlineSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_InlineSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_CrossRegionalSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_CrossRegionalSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_ImportTaxonomiesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_ImportTaxonomiesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_ExportTaxonomiesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_ExportTaxonomiesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_ExportTaxonomiesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_ExportTaxonomiesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n?google/cloud/datacatalog/v1/policytagm"
          + "anagerserialization.proto\022\033google.cloud."
          + "datacatalog.v1\032\034google/api/annotations.p"
          + "roto\032\037google/api/field_behavior.proto\032\031g"
          + "oogle/api/resource.proto\0322google/cloud/d"
          + "atacatalog/v1/policytagmanager.proto\032\032go"
          + "ogle/iam/v1/policy.proto\032\027google/api/cli"
          + "ent.proto\"\335\001\n\022SerializedTaxonomy\022\031\n\014disp"
          + "lay_name\030\001 \001(\tB\003\340A\002\022\023\n\013description\030\002 \001(\t"
          + "\022E\n\013policy_tags\030\003 \003(\01320.google.cloud.dat"
          + "acatalog.v1.SerializedPolicyTag\022P\n\026activ"
          + "ated_policy_types\030\004 \003(\01620.google.cloud.d"
          + "atacatalog.v1.Taxonomy.PolicyType\"\246\001\n\023Se"
          + "rializedPolicyTag\022\022\n\npolicy_tag\030\001 \001(\t\022\031\n"
          + "\014display_name\030\002 \001(\tB\003\340A\002\022\023\n\013description\030"
          + "\003 \001(\t\022K\n\021child_policy_tags\030\004 \003(\01320.googl"
          + "e.cloud.datacatalog.v1.SerializedPolicyT"
          + "ag\"\367\001\n\027ImportTaxonomiesRequest\022;\n\006parent"
          + "\030\001 \001(\tB+\340A\002\372A%\022#datacatalog.googleapis.c"
          + "om/Taxonomy\022B\n\rinline_source\030\002 \001(\0132).goo"
          + "gle.cloud.datacatalog.v1.InlineSourceH\000\022"
          + "Q\n\025cross_regional_source\030\003 \001(\01320.google."
          + "cloud.datacatalog.v1.CrossRegionalSource"
          + "H\000B\010\n\006source\"X\n\014InlineSource\022H\n\ntaxonomi"
          + "es\030\001 \003(\0132/.google.cloud.datacatalog.v1.S"
          + "erializedTaxonomyB\003\340A\002\"T\n\023CrossRegionalS"
          + "ource\022=\n\010taxonomy\030\001 \001(\tB+\340A\002\372A%\n#datacat"
          + "alog.googleapis.com/Taxonomy\"U\n\030ImportTa"
          + "xonomiesResponse\0229\n\ntaxonomies\030\001 \003(\0132%.g"
          + "oogle.cloud.datacatalog.v1.Taxonomy\"\307\001\n\027"
          + "ExportTaxonomiesRequest\022;\n\006parent\030\001 \001(\tB"
          + "+\340A\002\372A%\022#datacatalog.googleapis.com/Taxo"
          + "nomy\022?\n\ntaxonomies\030\002 \003(\tB+\340A\002\372A%\n#dataca"
          + "talog.googleapis.com/Taxonomy\022\037\n\025seriali"
          + "zed_taxonomies\030\003 \001(\010H\000B\r\n\013destination\"_\n"
          + "\030ExportTaxonomiesResponse\022C\n\ntaxonomies\030"
          + "\001 \003(\0132/.google.cloud.datacatalog.v1.Seri"
          + "alizedTaxonomy2\364\003\n\035PolicyTagManagerSeria"
          + "lization\022\301\001\n\020ImportTaxonomies\0224.google.c"
          + "loud.datacatalog.v1.ImportTaxonomiesRequ"
          + "est\0325.google.cloud.datacatalog.v1.Import"
          + "TaxonomiesResponse\"@\202\323\344\223\002:\"5/v1/{parent="
          + "projects/*/locations/*}/taxonomies:impor"
          + "t:\001*\022\276\001\n\020ExportTaxonomies\0224.google.cloud"
          + ".datacatalog.v1.ExportTaxonomiesRequest\032"
          + "5.google.cloud.datacatalog.v1.ExportTaxo"
          + "nomiesResponse\"=\202\323\344\223\0027\0225/v1/{parent=proj"
          + "ects/*/locations/*}/taxonomies:export\032N\312"
          + "A\032datacatalog.googleapis.com\322A.https://w"
          + "ww.googleapis.com/auth/cloud-platformB\357\001"
          + "\n\037com.google.cloud.datacatalog.v1B\"Polic"
          + "yTagManagerSerializationProtoP\001ZFgoogle."
          + "golang.org/genproto/googleapis/cloud/dat"
          + "acatalog/v1;datacatalog\370\001\001\252\002\033Google.Clou"
          + "d.DataCatalog.V1\312\002\033Google\\Cloud\\DataCata"
          + "log\\V1\352\002\036Google::Cloud::DataCatalog::V1b"
          + "\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.datacatalog.v1.PolicyTagManagerProto.getDescriptor(),
              com.google.iam.v1.PolicyProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
            });
    internal_static_google_cloud_datacatalog_v1_SerializedTaxonomy_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datacatalog_v1_SerializedTaxonomy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_SerializedTaxonomy_descriptor,
            new java.lang.String[] {
              "DisplayName", "Description", "PolicyTags", "ActivatedPolicyTypes",
            });
    internal_static_google_cloud_datacatalog_v1_SerializedPolicyTag_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_datacatalog_v1_SerializedPolicyTag_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_SerializedPolicyTag_descriptor,
            new java.lang.String[] {
              "PolicyTag", "DisplayName", "Description", "ChildPolicyTags",
            });
    internal_static_google_cloud_datacatalog_v1_ImportTaxonomiesRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_datacatalog_v1_ImportTaxonomiesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_ImportTaxonomiesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "InlineSource", "CrossRegionalSource", "Source",
            });
    internal_static_google_cloud_datacatalog_v1_InlineSource_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_datacatalog_v1_InlineSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_InlineSource_descriptor,
            new java.lang.String[] {
              "Taxonomies",
            });
    internal_static_google_cloud_datacatalog_v1_CrossRegionalSource_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_datacatalog_v1_CrossRegionalSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_CrossRegionalSource_descriptor,
            new java.lang.String[] {
              "Taxonomy",
            });
    internal_static_google_cloud_datacatalog_v1_ImportTaxonomiesResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_datacatalog_v1_ImportTaxonomiesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_ImportTaxonomiesResponse_descriptor,
            new java.lang.String[] {
              "Taxonomies",
            });
    internal_static_google_cloud_datacatalog_v1_ExportTaxonomiesRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_datacatalog_v1_ExportTaxonomiesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_ExportTaxonomiesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Taxonomies", "SerializedTaxonomies", "Destination",
            });
    internal_static_google_cloud_datacatalog_v1_ExportTaxonomiesResponse_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_datacatalog_v1_ExportTaxonomiesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_ExportTaxonomiesResponse_descriptor,
            new java.lang.String[] {
              "Taxonomies",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.datacatalog.v1.PolicyTagManagerProto.getDescriptor();
    com.google.iam.v1.PolicyProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
